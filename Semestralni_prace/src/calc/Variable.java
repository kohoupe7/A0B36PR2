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
    

    public Variable(char jmeno) {
        this.jmeno = jmeno;
    
    }

    @Override
    public double evaluate(double x) {
        return x;
    }



    @Override
    public String toString() {
        return String.valueOf(jmeno);
    }
}
