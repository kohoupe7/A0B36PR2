package calc;

import exeptions.ZavorkyExep;
import java.util.ArrayList;

/**
 *
 * @author Petr Kohout
 */
public class Vyraz {

    private String vyraz = new String();
    private ArrayList listLevy = new ArrayList();
    private ArrayList listKopie = new ArrayList();
    private Expr e;

    public Vyraz() {
    }

    public void napln() throws ZavorkyExep {
        listKopie = (ArrayList) listLevy.clone();
        e = Operace.zArrayListu(listKopie);

    }

    public boolean isEmpty() {
        return listLevy.isEmpty();
    }

    public String vyres() throws ZavorkyExep {
        napln();
        return String.valueOf(e.evaluate(0));
    }

    public void clear() {
        vyraz = "";
    }
    
    public String unarMinus(){
        if(Character.isDigit(((String)listLevy.get(listLevy.size()-1)).charAt(0))){
        double cislo = Double.valueOf((String)listLevy.get(listLevy.size()-1))*(-1);
        listLevy.set(listLevy.size()-1,String.valueOf(cislo) );
        vyraz=Tools.arraylistToString(listLevy);
        }else if(((String)listLevy.get(listLevy.size()-1)).charAt(0)=='-' ){
            double cislo = Double.valueOf((String)listLevy.get(listLevy.size()-1))*(-1);
        listLevy.set(listLevy.size()-1,String.valueOf(cislo) );
        vyraz=Tools.arraylistToString(listLevy);
        }
        
     return vyraz;   
    }

    public void pridej(String co) {
        vyraz += co;
        listLevy = Tools.naplnArrayList(vyraz);
    }

    public void odeber() {
        if (vyraz.length() != 0) {
            if (((String) listLevy.get(listLevy.size() - 1)).charAt(0) == '(' && listLevy.size() != 1) {
                switch (((String) listLevy.get(listLevy.size() - 2)).charAt(0)) {
                    case ('o'):
                        vyraz = vyraz.substring(0, vyraz.length() - 5);
                        break;
                    case ('s'):
                    case ('c'):
                    case ('d'):
                        vyraz = vyraz.substring(0, vyraz.length() - 4);
                        break;
                    case ('l'):
                    case ('p'):
                        vyraz = vyraz.substring(0, vyraz.length() - 3);
                        break;
                    default:
                        vyraz = vyraz.substring(0, vyraz.length() - 1);
                }
            } else {
                vyraz = vyraz.substring(0, vyraz.length() - 1);
            }

        }
        listLevy = Tools.naplnArrayList(vyraz);
    }

    public String getVyraz() {
        return vyraz;
    }

    public Expr getExp() {
        return e;
    }
}
