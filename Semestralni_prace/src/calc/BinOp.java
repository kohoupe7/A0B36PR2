/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author petr
 */
public class BinOp extends Expr {

    private char typ;
    private Expr vyraz1;
    private Expr vyraz2;

    public BinOp(char typ, Expr vyraz1, Expr vyraz2) {
        this.typ = typ;
        this.vyraz1 = vyraz1;
        this.vyraz2 = vyraz2;
    }

    @Override
    double evaluate() {
        double hodn1 = vyraz1.evaluate();
        double hodn2 = vyraz2.evaluate();
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
        }

        return vysledek;
    }


    @Override
    public String toString() {

        return "(" + vyraz1.toString() + " " + String.valueOf(typ) + " " + vyraz2.toString() + ")";
    }
}
