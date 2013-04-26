
package graf;

import calc.Expr;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author petr
 */
public class Prubeh {

    private double minimum, maximum, krok;
    private int nulaX, nulaY, krokX, krokY;
    private Graphics g;
    private ArrayList<BodGrafu> bod = new ArrayList<>();
    Color barva;
    Expr exp;

    public Prubeh(Expr e, double minimum, double maximum, double krok, Graphics g, Color barva, int nulaX, int nulaY, int krokX, int krokY) {
        this.exp = e;
        this.minimum = minimum;
        this.maximum = maximum;
        this.krok = krok;
        this.nulaX = nulaX;
        this.nulaY = nulaY;
        this.krokX = krokX;
        this.krokY = krokY;
        this.g = g;
        this.barva = barva;
        vypocitejBody();

    }

    private void vypocitejBody() {
        bod.clear();
        for (double i = minimum; i <= maximum; i = i + krok) {
            BodGrafu k = new BodGrafu(i, exp);
            bod.add(k);
        }       
        vykresli();
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
        vypocitejBody();
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
        vypocitejBody();
    }

    public void setKrok(double krok) {
        this.krok = krok;
        vypocitejBody();
    }

    private void vykresli() {
        int souradniceX1, souradniceX2, souradniceY1, souradniceY2;
        double y1;
        souradniceX1 = Tools.sourToPx(bod.get(0).getX(), nulaX, krokX, Graf.getHodnotaDilku('x'));
        souradniceY1 = Tools.sourToPx(bod.get(0).getY(), nulaY, krokY, Graf.getHodnotaDilku('y'));
        y1=bod.get(0).getY();
        for (int i = 1; i < bod.size(); i++) {
            souradniceX2 = Tools.sourToPx(bod.get(i).getX(), nulaX, krokX, Graf.getHodnotaDilku('x'));
            souradniceY2 = Tools.sourToPx(bod.get(i).getY(), nulaY, krokY, Graf.getHodnotaDilku('y'));
            g.setColor(barva);
           
             if(!Double.isInfinite(bod.get(i).getY())&& !Double.isNaN(bod.get(i).getY()) &&!Double.isInfinite(y1)&& !Double.isNaN(y1) ){
            g.drawLine(souradniceX1, souradniceY1, souradniceX2, souradniceY2);}
            souradniceX1 = souradniceX2;
            souradniceY1 = souradniceY2;
            y1=bod.get(i).getY();

        }
    }
}
