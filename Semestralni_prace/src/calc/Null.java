/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author petr
 */
public class Null extends Expr {

    public Null() {
    }

    @Override
    public double evaluate(double x) {
        return 0;
    }

    @Override
    public boolean hasVar(char name) {
        return false;
    }
}
