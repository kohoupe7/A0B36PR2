package calc;

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

    @Override
    public boolean hasVar(char name) {
        return jmeno == name ? true : false;
    }
}
