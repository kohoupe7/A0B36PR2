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
    Expr derive(char var) {
        switch (typ) {
            case '+':
                return new BinOp('+', vyraz1.derive(var), vyraz2.derive(var));
            case '-':
                return new BinOp('-', vyraz1.derive(var), vyraz2.derive(var));
            case '*':
                return new BinOp('+', new BinOp('*', vyraz1, vyraz2.derive(var)), new BinOp('*', vyraz2, vyraz1.derive(var)));
            case '/':
                return new BinOp('/', new BinOp('-', new BinOp('*', vyraz1.derive(var), vyraz2), new BinOp('*', vyraz1, vyraz2.derive(var))), new BinOp('*', vyraz2, vyraz2));
        }
        return null;
    }

    @Override
    Expr simplify() {
        Expr zj1, zj2;

        zj1 = vyraz1.simplify();
        zj2 = vyraz2.simplify();

        switch (typ) {
            case '+':
                if ("du1.Constant".equals(zj1.getClass().getName())) {
                    if (((Constant) zj1).getHodnota() == 0) {
                        return zj2;
                    }
                }
                if ("du1.Constant".equals(zj2.getClass().getName())) {
                    if (((Constant) zj2).getHodnota() == 0) {
                        return zj1;
                    }
                }
                break;
            case '*':
                if ("du1.Constant".equals(zj1.getClass().getName())) {
                    if (((Constant) zj1).getHodnota() == 0) {
                        return new Constant(0);
                    } else if (((Constant) zj1).getHodnota() == 1) {
                        return zj2;
                    }
                }
                if ("du1.Constant".equals(zj2.getClass().getName())) {
                    if (((Constant) zj2).getHodnota() == 0) {
                        return new Constant(0);
                    } else if (((Constant) zj2).getHodnota() == 1) {
                        return zj1;
                    }
                }


                break;

        }


        return new BinOp(typ, zj1, zj2);
    }

    @Override
    public String toString() {

        return "(" + vyraz1.toString() + " " + String.valueOf(typ) + " " + vyraz2.toString() + ")";
    }
}
