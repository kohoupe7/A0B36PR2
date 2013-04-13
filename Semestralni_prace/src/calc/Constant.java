/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author petr
 */
public class Constant extends Expr {

    private double hodnota;

    public Constant(double hodnota) {
        this.hodnota = hodnota;
    }

    @Override
    public double evaluate(double x) {
        return hodnota;
    }

    @Override
    public String toString() {
        return String.format("%.3f", hodnota); // desetiná čárka/tečka ?
    }

    @Override
    public boolean hasVar(char name) {
        return false;
    }
}
