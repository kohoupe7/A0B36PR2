
package classes;

/**
 *
 * @author Petr Kohout
 */
public class Vyraz {

    private String vyraz = new String();
    private boolean polynom;

    public Vyraz() {
        polynom = false;
    }

    public String vyres() {
        return "not yet";
    }

    public void pridej(String co) {
        vyraz += co;
        if ("X".equals(co) || "Y".equals(co)) {
            polynom = true;
        }
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
           polynom=poradPolynom();
        }
    }

    public void setPolynom(boolean polynom) {
        this.polynom = polynom;
    }

    public void setVyraz(String vyraz) {
        this.vyraz = vyraz;
    }

    public String getVyraz() {
        return vyraz;
    }

    public boolean isPolynom() {
        return polynom;
    }
}
