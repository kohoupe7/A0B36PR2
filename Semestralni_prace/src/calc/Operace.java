
package calc;

import exeptions.ChybiOperandExep;
import exeptions.ZavorkyExep;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author petr
 */
public class Operace extends Expr {

    private char typ;
    private Expr vyraz1;
    private Expr vyraz2;

    public Operace(char typ, Expr vyraz1, Expr vyraz2) {
        this.typ = typ;
        this.vyraz1 = vyraz1;
        this.vyraz2 = vyraz2;

    }

    @Override
    public double evaluate(double x) {//vyhodnocení výrazu 
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
                vysledek = Math.pow(hodn1, hodn2);
                break;
            case 'o'://odmocnina
                vysledek = Math.pow(hodn2, 1 / hodn1);
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

    private int faktorial(int x) {
        return x == 0 ? 1 : x * faktorial(x - 1);
    }

    public static Expr zArrayListu(ArrayList levy) throws ZavorkyExep, ChybiOperandExep {
        return arrayListToOp(levy);//převádí výraz rozparsovaný v ArrayListu na instanci třídy Expr
    }

    public static Expr arrayListToOp(ArrayList list) throws ZavorkyExep, ChybiOperandExep {
        //Kontrola párovosti závorek
        int pocetZavorek = 0;   
         for (int i = 0; i < list.size(); i++) {
            if ("(".equals((String) list.get(i))) {
                pocetZavorek++;
            }
            if (")".equals((String) list.get(i))) {
                pocetZavorek--;
            }
            if(pocetZavorek<0){
            throw new ZavorkyExep("Závorky jsou někde prohozeny");}
        }
        if (pocetZavorek != 0) {
            throw new ZavorkyExep("Nepárové závorky");
        }
        
        
        //Kontrola párovosti závorek - end
        for (int i = 0; i < list.size(); i++) {
            String akt = (String)list.get(i);
            if("(".equals(akt)){
                if(")".equals((String)list.get(i+1))){
                throw new ZavorkyExep("Nalezeny prázdné závorky");
                }
            }
            
        }
        //kontrola zda bylz zadány všechna potřebná čísla
       Tools.zkontrolujOperandy(list);
        //kontrola zda bylz zadány všechna potřebná čísla - end    
       
        list.add(0, "(");
        list.add(")");
        //přidalo na zacatek a konec zavorky
        int indexLevy;
        int indexPravy;
        while (((indexLevy = list.lastIndexOf("(")) != -1) && list.size() >= 3) {

            List sub = list.subList(indexLevy, list.size());
            indexPravy = sub.indexOf(")");
            indexLevy = 0;

            List zavorka = sub.subList(indexLevy + 1, indexPravy);

            //vyřeší konstanty Pí a E
            int indexPiE;
            while (((indexPiE = zavorka.indexOf("p")) != -1) || ((indexPiE = zavorka.indexOf("e")) != -1)) {
                Expr nahrad = new Operace(((String) zavorka.get(indexPiE)).charAt(0), new Null(), new Null());

                zavorka.remove(indexPiE);
                zavorka.add(indexPiE, nahrad);
            }
            //vyřeší proměnné X a Y, kvůli lepšímu zpracování převede na součet proměnné plus 0
            int indexPromene;
            while (((indexPromene = zavorka.indexOf("X")) != -1) || ((indexPromene = zavorka.indexOf("Y")) != -1)) {
                Expr nahrad = new Operace('+', new Variable(((String) zavorka.get(indexPromene)).charAt(0)), new Null());

                zavorka.remove(indexPromene);
                zavorka.add(indexPromene, nahrad);
            }

            //vyřeší faktoriál
            int indexFakt;
            while (((indexFakt = zavorka.indexOf("!")) != -1)) {
                Expr nahrad = new Operace(((String) zavorka.get(indexFakt)).charAt(0), zavorka.get(indexFakt - 1).getClass() == Operace.class ? (Operace) zavorka.get(indexFakt - 1) : new Constant(Double.valueOf((String) zavorka.get(indexFakt - 1))), new Null());

                zavorka.remove(indexFakt - 1);
                zavorka.remove(indexFakt - 1);
                zavorka.add(indexFakt - 1, nahrad);

            }

            //vyřeší mocnění
            int indexMocnitka;
            while (((indexMocnitka = zavorka.indexOf("^")) != -1) || ((indexMocnitka = zavorka.indexOf("o")) != -1)) {
                Expr nahrad = new Operace(((String) zavorka.get(indexMocnitka)).charAt(0), zavorka.get(indexMocnitka - 1).getClass() == Operace.class ? (Operace) zavorka.get(indexMocnitka - 1) : new Constant(Double.valueOf((String) zavorka.get(indexMocnitka - 1))), zavorka.get(indexMocnitka + 1).getClass() == Operace.class ? (Operace) zavorka.get(indexMocnitka + 1) : new Constant(Double.valueOf((String) zavorka.get(indexMocnitka + 1))));

                zavorka.remove(indexMocnitka - 1);
                zavorka.remove(indexMocnitka - 1);
                zavorka.remove(indexMocnitka - 1);
                zavorka.add(indexMocnitka - 1, nahrad);

            }
            //vyřeší sinus, kosinus a logaritmy
            int indexFce;
            while (((indexFce = zavorka.indexOf("s")) != -1) || ((indexFce = zavorka.indexOf("c")) != -1) || ((indexFce = zavorka.indexOf("l")) != -1) || ((indexFce = zavorka.indexOf("d")) != -1)) {
                Expr nahrad = new Operace(((String) zavorka.get(indexFce)).charAt(0), zavorka.get(indexFce + 1).getClass() == Operace.class ? (Operace) zavorka.get(indexFce + 1) : new Constant(Double.valueOf((String) zavorka.get(indexFce + 1))), new Null());

                zavorka.remove(indexFce);
                zavorka.remove(indexFce);
                zavorka.add(indexFce, nahrad);

            }


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
            if (sub.size() == 3 && sub.get(1).getClass() != Operace.class) {
                if (Character.isDigit(((String) sub.get(1)).charAt(0))) {
                    sub.add(1, new Constant(Double.valueOf((String) sub.get(1))));
                    sub.remove(2);
                }
            }

            sub.remove(indexLevy);
            sub.remove(indexLevy + 1);//počítá s tím, že v arraylistu zbude pouze (operace)
        }

        return (Expr) list.get(0);
    }

    @Override
    public boolean hasVar(char name) {
        return vyraz1.hasVar(name) || vyraz2.hasVar(name);
    }
}
