/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author petr
 */
public class Operace extends Expr {

    private static Exception NeparoveZavorkyExep;
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
                vysledek = faktorial((int) hodn1);
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

    private int faktorial(int x) {
        return x == 0 ? 0 : x * faktorial(x - 1);
    }

    public static Expr zArrayListu(ArrayList levy, ArrayList pravy) throws NeparoveZavorkyExep {  
        //Kontrola párovosti závorek
        int pocetLevych = 0;
        int pocetPravych = 0;
        for (int i = 0; i < levy.size(); i++) {
            if ("(".equals((String)levy.get(i))) {
                pocetLevych++;
            }
            if (")".equals((String)levy.get(i))) {
                pocetPravych++;
            }
        }
        if (pocetLevych != pocetPravych) {
            throw new NeparoveZavorkyExep();
        }
        //Kontrola párovosti závorek - end
        levy.add(0, "(");
        levy.add(")");
        //přidalo na zacatek a konec zavorky
        int indexLevy;
        int indexPravy;
        while (((indexLevy = levy.lastIndexOf("(")) != -1)&&levy.size()>=3) {

            List sub = levy.subList(indexLevy, levy.size());
            indexPravy = sub.indexOf(")");
            indexLevy = 0;



            List zavorka = sub.subList(indexLevy + 1, indexPravy);

            // vyresi krat a deleno
            int indexNasobitka;
            while (((indexNasobitka = zavorka.indexOf("*")) != -1) || ((indexNasobitka = zavorka.indexOf("/")) != -1)) {
                Expr nahrad = new Operace(((String) zavorka.get(indexNasobitka)).charAt(0), zavorka.get(indexNasobitka - 1).getClass() == Operace.class ? (Operace) zavorka.get(indexNasobitka - 1) : new Constant(Double.valueOf((String) zavorka.get(indexNasobitka - 1))), zavorka.get(indexNasobitka + 1).getClass() == Operace.class ? (Operace) zavorka.get(indexNasobitka + 1) : new Constant(Double.valueOf((String) zavorka.get(indexNasobitka + 1))));

                zavorka.remove(indexNasobitka - 1);
                zavorka.remove(indexNasobitka - 1);
                zavorka.remove(indexNasobitka - 1);
                zavorka.add(indexNasobitka - 1, nahrad);


            }
            //vyresi plus a minus
            int indexPlusitka;
            while (((indexPlusitka = zavorka.indexOf("+")) != -1) || ((indexPlusitka = zavorka.indexOf("-")) != -1)) {
                Expr nahrad = new Operace(((String) zavorka.get(indexPlusitka)).charAt(0), zavorka.get(indexPlusitka - 1).getClass() == Operace.class ? (Operace) zavorka.get(indexPlusitka - 1) : new Constant(Double.valueOf((String) zavorka.get(indexPlusitka - 1))), zavorka.get(indexPlusitka + 1).getClass() == Operace.class ? (Operace) zavorka.get(indexPlusitka + 1) : new Constant(Double.valueOf((String) zavorka.get(indexPlusitka + 1))));

                zavorka.remove(indexPlusitka - 1);
                zavorka.remove(indexPlusitka - 1);
                zavorka.remove(indexPlusitka - 1);
                zavorka.add(indexPlusitka - 1, nahrad);

            }
            sub.remove(indexLevy);
            sub.remove(indexLevy + 1);
        }




        return (Expr)levy.get(0);
    }
}
