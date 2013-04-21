/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graf;

import calc.Expr;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author petr
 */
public class BodGrafu {

    double x, y;
    Expr exp;

    public BodGrafu(double x, Expr exp) {
        this.exp = exp;
        this.x = x;
        y = -1 * hodnotaVBode(x);
    }

    public BodGrafu(Expr exp,double x, int nulaX, int krokX, int nulaY, int krokY, Graphics g, int velikost, Color barva, double hodnotaDilkuX, double hodnotaDilkuy) {
       this.exp = exp;
        this.x = x;
        y = hodnotaVBode(x);
        //System.out.println(x);
        g.setColor(Color.GREEN);
        int souradniceX = Tools.sourToPx(x, nulaX, krokX, hodnotaDilkuX);
        int souradniceY = Tools.sourToPx(-1 * y, nulaY, krokY, hodnotaDilkuy);
        g.fillOval(souradniceX - velikost / 2, souradniceY - velikost / 2, velikost, velikost);
    }

    private double hodnotaVBode(double x) { //TODO tady
        return exp.evaluate(x);

//        return Math.sin(x);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y; //To change body of generated methods, choose Tools | Templates.
    }
}
