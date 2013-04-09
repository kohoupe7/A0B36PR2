/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.ArrayList;

/**
 *
 * @author petr
 */
public class Operace extends Expr {

    private char typ; //+ , - , * , / , =
    private Expr vyraz1;
    private Expr vyraz2;

    public Operace(char typ, Expr vyraz1, Expr vyraz2) {
        this.typ = typ;
        this.vyraz1 = vyraz1;
        this.vyraz2 = vyraz2;
       
    }

    @Override
   public double evaluate(double x) {
        double hodn1 = vyraz1.evaluate(x);
        double hodn2 = vyraz2.evaluate(x);
        double vysledek = 0;
        switch (typ) {
            case '+':
                vysledek = hodn1 + hodn2;
                break;
            case '-':
                vysledek = hodn1 - hodn2;
                break;
            case '*':
                vysledek = hodn1 * hodn2;
                break;
            case '/':
                vysledek = hodn1 / hodn2;
                break;
            case '!'://faktoriál 
                vysledek = faktorial((int)hodn1);
                break;
            case '^'://na
                vysledek = Math.pow(hodn1, 2);
                break;
            case '0'://odmocnina
                vysledek = Math.sqrt(hodn1);
                break;
            case 's'://sinus
                vysledek = Math.sin(hodn1);
                break;
            case 'c'://cos
                vysledek = Math.cos(hodn1);
                break;
            case 'l'://ln
                vysledek = Math.log(hodn1);
                break;
            case 'd'://log
                vysledek = Math.log10(hodn1);
                break;
            case 'p'://pí
                vysledek = Math.PI;
                break;
            case 'e'://e
                vysledek = Math.E;
                break;
               
        }

        return vysledek;
    }

    @Override
    public String toString() {

        return "(" + vyraz1.toString() + " " + String.valueOf(typ) + " " + vyraz2.toString() + ")";
    }

    private int faktorial(int x){ 
    return x==0?0:x*faktorial(x-1);
    }
    
    public static Expr zArrayListu(ArrayList levy, ArrayList pravy) {
        return null;
    }
//    public static Expr fromArrayList(ArrayList List) throws ArrayIndexOutOfBoundsException {
//        if (List.size()==1 && List.get(0).getClass()==Operace.class){
//            return (Expr) List.get(0);
//        }
//
//        int pocetzavorek = 0;
//        int indexKZ = 0; // Index konečné závorky
//        int indexZZ = Integer.MAX_VALUE; // Index začátku závorky
//
//        //Spočítá počet závorek, uzavřených dvojic.
//        for (int i = 0; List.size() > i; i++) {
//            if (List.get(i).toString().charAt(0) == '(') {
//                pocetzavorek++;
//            }
//        }
//
//        // Jestliže je první znak řetězce znak '-', bude první čílso záporné.
//        if ((List.get(0).toString().charAt(0) == '-') && List.get(0).toString().length() == 1) {
//            List.add(1, new Constant(Double.valueOf(List.get(1).toString()) * -1));
//            List.remove(0);
//            List.remove(1); // odepbere se index 0, to co bylo index 1 je 0, 2 je 1
//        }
//        if ((List.get(0).toString().charAt(0) == '+') && List.get(0).toString().length() == 1) {           
//            List.remove(0);          
//        }      
//        // Převede čísla v řetězci na konstanty.
//        for (int i = 0; i < List.size(); i++) {
//            if (Character.isDigit(List.get(i).toString().charAt(0)) && List.get(i).getClass().equals(Constant.class) == false) {
//                List.set(i, new Constant(Double.valueOf(List.get(i).toString())));
//            }
//        }
//
//        while (pocetzavorek != 0) {
//            //Najde index nejvnitřejší konečné závorky.
//            for (int i = 0; indexKZ == 0; i++) {
//                if (List.get(i).toString().charAt(0) == ')') {
//                    indexKZ = i;
//                }
//            }
//            //Najde index nejvnitřejší začínající závorky.
//            for (int i = indexKZ; indexZZ == Integer.MAX_VALUE; i--) {
//                if (List.get(i).toString().charAt(0) == '(') {
//                    indexZZ = i;
//                }
//            }
//            //Vytvoří nový ArrayList obsahujicí řetězec nejvnitřejší závorky.
//            ArrayList ListP = new ArrayList();
//            for (int j = indexZZ + 1; j != indexKZ; j++) {
//                ListP.add(List.get(j));
//            }
//            for (int j = indexKZ; j != indexZZ - 1; j--) {
//                List.remove(j);
//            }
//            //Zavolá znovu metodu výpočet, jako vstup bude ArrayList vnitřní závorky.
//            //List.add(indexZZ, Operace.fromArrayList(ListP));
//            List.add(indexZZ, Operace.fromArrayList(ListP));
//            ListP.clear();
//            pocetzavorek--;
//            indexKZ = 0;
//            indexZZ = Integer.MAX_VALUE;
//        }
//        // Jestliže je za nebo před závorkou číslo bude bude mezi číslo a závorku vložen znak násobení.
//        for (int i = 0; i < List.size() - 1; i++) {
//            if (Character.isDigit(List.get(i).toString().charAt(0)) && Character.isDigit(List.get(i + 1).toString().charAt(0))) {
//                List.add(i + 1, '*');
//            }
//        }
//        /**
//         * Vlastní výpočet, vložený řetězec skládá na class Operace podle
//         * matematických zákonů. Nejprve se provede násobení a dělení a poté
//         * teprve sčítání a odčítání.
//         */
//        for (int i = 0; i < List.size(); i++) {
//            if (List.get(i).getClass() == "".getClass() && (List.get(i).toString().charAt(0) == '^')) {
//                List.set(i, new Operace(String.valueOf(List.get(i)).toCharArray()[0], (Expr) List.get(i - 1), (Expr) List.get(i + 1)));
//                List.remove(i + 1);
//                List.remove(i - 1);
//                i--;
//            }
//        }
//
//        for (int i = 0; i < List.size(); i++) {
//            if (List.get(i).getClass() == "".getClass() && (List.get(i).toString().charAt(0) == '*' || List.get(i).toString().charAt(0) == '/')) {
//                List.set(i, new Operace(String.valueOf(List.get(i)).toCharArray()[0], (Expr) List.get(i - 1), (Expr) List.get(i + 1)));
//                List.remove(i + 1);
//                List.remove(i - 1);
//                i--;
//            }
//        }
//
//        for (int i = 0; i < List.size(); i++) {
//            if (List.get(i).getClass() == "".getClass()) {
//                List.set(i, new Operace(String.valueOf(List.get(i)).toCharArray()[0], (Expr) List.get(i - 1), (Expr) List.get(i + 1)));
//                List.remove(i + 1);
//                List.remove(i - 1);
//                i--;
//            }
//        }
//        return new Bracers('(', (Expr) List.get(0), ')');
//    }
}
