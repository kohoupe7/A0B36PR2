package calc;

import exeptions.ChybiOperandExep;
import exeptions.ZnamenkaExep;
import java.util.ArrayList;

public class Tools {

    public static String arraylistToString(ArrayList list) {// převádí z rozparsovaného ArrayListu zpět na String. To znamená zpět doplnit vícepísmenné operátory
        String out = list.toString(); 
        out = out.replaceAll("p", "pi");
        out = out.replaceAll("s", "sin");
        out = out.replaceAll("c", "cos");
        out = out.replaceAll("o", "sqrt");
        out = out.replaceAll("l", "ln");
        out = out.replaceAll("d", "log");
        out = out.substring(1, out.length() - 1);
        out = out.replaceAll(",", "");
        out = out.replaceAll(".0", "");
        return out;
    }

    public static String nahradNepohodlne(String input) {//převede vícepísmené názvy operátorů na jednopísmené
        //ošetření vícepísmených názvů funkcí
        input = input.replaceAll("pi", "p");
        input = input.replaceAll("sin", "s");
        input = input.replaceAll("cos", "c");
        input = input.replaceAll("sqrt", "o");
        input = input.replaceAll("ln", "l");
        input = input.replaceAll("log", "d");
        //ošetření vícepísmených názvů funkcí - end
        return input;
    }

    public static void zkontrolujOperandy(ArrayList list) throws ChybiOperandExep, ZnamenkaExep {//kontrola zda všechny operátory mají co potřebujou
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);

            switch (s) {
                case "+":
                case "-":
                    if (i == 0) {
                        list.add(0, "0");
                    } else {
                        if ("+".equals((String) list.get(i - 1)) || "-".equals((String) list.get(i - 1)) || "*".equals((String) list.get(i - 1)) || "/".equals((String) list.get(i - 1)) || "^".equals((String) list.get(i - 1))) {
                            throw new ZnamenkaExep((String) list.get(i - 1) + " a " + (String) list.get(i));
                        }
                    }
                case "s":
                case "c":
                case "l":
                case "d":
                    if (i == list.size() - 1) {
                        throw new ChybiOperandExep((String) list.get(list.size() - 1));
                    }
                    break;
                case "!":
                    if (i == 0) {
                        throw new ChybiOperandExep((String) list.get(0));
                    } else {
                        if ("+".equals((String) list.get(i - 1)) || "-".equals((String) list.get(i - 1)) || "*".equals((String) list.get(i - 1)) || "/".equals((String) list.get(i - 1)) || "^".equals((String) list.get(i - 1))) {
                            throw new ZnamenkaExep((String) list.get(i - 1) + " a " + (String) list.get(i));
                        }
                    }
                    break;
                case "o":
                case "^":
                case "/":
                case "*":
                    if (i == 0) {
                        throw new ChybiOperandExep((String) list.get(0));
                    } else if (i == list.size() - 1) {
                        throw new ChybiOperandExep((String) list.get(list.size() - 1));
                    } else {
                        if ("+".equals((String) list.get(i - 1)) || "-".equals((String) list.get(i - 1)) || "*".equals((String) list.get(i - 1)) || "/".equals((String) list.get(i - 1)) || "^".equals((String) list.get(i - 1))) {
                            throw new ZnamenkaExep((String) list.get(i - 1) + " a " + (String) list.get(i));
                        }
                    }
                    break;
            }

        }
    }

    public static ArrayList naplnArrayList(String input) {//výraz ze stringu rozparsuje do ArrayListu

        boolean isDigit = false;
        ArrayList ret = new ArrayList();
        String cast = null;
        input = nahradNepohodlne(input);


        for (int i = 0; i < input.length(); i++) {
            cast = isDigit ? cast + input.charAt(i) : Character.toString(input.charAt(i));

            if ((i + 1 != input.length()) && (Character.isDigit(input.charAt(i)) || input.charAt(i) == '.') && (Character.isDigit(input.charAt(i + 1)) || input.charAt(i + 1) == '.')) {
                isDigit = true;
            } else {
                isDigit = false;
                ret.add(cast);
                cast = null;
            }
        }
        for (int i = 0; i < ret.size(); i++) {//pokud je zadáno třeba 2X tak nahradí 2*X
            if (("s".equals((String) ret.get(i)) || "c".equals((String) ret.get(i)) || "l".equals((String) ret.get(i)) || "d".equals((String) ret.get(i)) || "X".equals((String) ret.get(i))) && i != 0) {
                if (Character.isDigit(((String) ret.get(i - 1)).charAt(0))) {
                    ret.add(i, "*");
                }
            }

        }
        return ret;
    }
}
