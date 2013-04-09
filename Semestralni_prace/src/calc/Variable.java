/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author petr
 */
public class Variable extends Expr {

    private char jmeno;
    private int hodnota;

    public Variable(char jmeno, int hodnota) {
        this.jmeno = jmeno;
        this.hodnota = hodnota;
    }

    @Override
    double evaluate() {
        return hodnota;
    }



    @Override
    public String toString() {
        return String.valueOf(jmeno);
    }
}
