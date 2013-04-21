/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import exeptions.ChybiOperandExep;
import java.util.ArrayList;

/**
 *
 * @author petr
 */
public class Tools {

    public static String arraylistToString(ArrayList list){
    String out = list.toString();
    out = out.replaceAll("p","pi");
        out = out.replaceAll("s","sin");
        out = out.replaceAll("c","cos");
        out = out.replaceAll("o","sqrt");
        out = out.replaceAll("l","ln");
        out = out.replaceAll("d","log");
        out=out.substring(1,out.length()-1);
        out = out.replaceAll(",","");
        out = out.replaceAll(".0","");
        return out;
    }
    
    public static String nahradNepohodlne(String input) {
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

    public static void zkontrolujOperandy(ArrayList list) throws ChybiOperandExep {//TODO očetřit když jsou 2 operatory vedle sebe
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);

            switch (s) {
                case "+":
                case "-":
                    if (i == 0) {
                        list.add(0, "0");
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
                    }
                    break;
            }

        }
    }

    public static ArrayList naplnArrayList(String input) {

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
