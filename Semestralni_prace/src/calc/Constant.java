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

    public double getHodnota() {
        return hodnota;
    }

    @Override
    double evaluate() {
        return hodnota;
    }

    @Override
    Expr derive(char var) {
        return new Constant(0);
    }

    @Override
    Expr simplify() {
        return new Constant(hodnota);
    }

    @Override
    public String toString() {
        return String.format("%.3f", hodnota); // desetiná čárka/tečka ?
    }
}
