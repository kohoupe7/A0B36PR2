package calc;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Petr Kohout
 */
public class Vyraz {
    
    private String vyraz = new String();
    private ArrayList listLevy = new ArrayList();
    private ArrayList listPravy = new ArrayList();
    private boolean polynom;
    private Expr e;
    
    public Vyraz() {
        polynom = false;
    }
    
    public String vyres() {
        try {      
            e=Operace.zArrayListu(listLevy, listPravy);
        } catch (NeparoveZavorkyExep ex) {
            Logger.getLogger(Vyraz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return String.valueOf(e.evaluate(0));
    }
    
    public void clear(){
    vyraz="";
    }
    public void pridej(String co) {
        
        vyraz += co;
        if ("X".equals(co) || "Y".equals(co)) {
            polynom = true;
        }
        if (vyraz.indexOf('=') == -1) {
            listLevy = Tools.naplnArrayList(vyraz);
        } else if(vyraz.indexOf('=') != -1 && vyraz.indexOf('=') != vyraz.length()){
            listPravy = Tools.naplnArrayList(vyraz.substring(vyraz.indexOf('=')));
        }
        //e=Operace.zArrayListu(listLevy, listPravy);
    }
    
    private boolean poradPolynom() {
        if (vyraz.indexOf("X") == -1 && vyraz.indexOf("Y") == -1) {
            return false;
        } else {
            return true;
        }
    }
    
    public void odeber() {
        if (vyraz.length() != 0) {
            vyraz = vyraz.substring(0, vyraz.length() - 1);
            polynom = poradPolynom();
        }
         if (vyraz.indexOf('=') == -1) {
            listLevy = Tools.naplnArrayList(vyraz);
            listPravy.clear();
        } else if(vyraz.indexOf('=') != -1 && vyraz.indexOf('=') != vyraz.length()) {
            listPravy = Tools.naplnArrayList(vyraz.substring(vyraz.indexOf('=')));
        }
         //e=Operace.zArrayListu(listLevy, listPravy);
    }
    
  
    public String getVyraz() {
        return vyraz;
    }
    
    public boolean isPolynom() {
        return polynom;
    }

    public Expr getE() { //TODO vrátí vyjádřený Y
        
        return e;
    }
    
}
