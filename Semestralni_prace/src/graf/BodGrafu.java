package graf;

import calc.Expr;
import java.awt.Color;
import java.awt.Graphics;


public class BodGrafu {//uchovává souřadnice jednotlivých bodů grafu

    double x, y;
    Expr exp;

    public BodGrafu(double x, Expr exp) {//konstruktor pro vykreslování celého grafů, nevykresluje jednotlivé body
        this.exp = exp;
        this.x = x;
        y = -1 * hodnotaVBode(x);
    }

    //konstruktor pro zobrazování bodu na grafu. Rovnou bod vykresluje
    public BodGrafu(Expr exp,double x, int nulaX, int krokX, int nulaY, int krokY, Graphics g, int velikost, Color barva, double hodnotaDilkuX, double hodnotaDilkuy) {
       this.exp = exp;
        this.x = x;
        y = hodnotaVBode(x);
        
        g.setColor(Color.GREEN);//nastaví barvu na zeleno
        int souradniceX = Tools.sourToPx(x, nulaX, krokX, hodnotaDilkuX);
        int souradniceY = Tools.sourToPx(-1 * y, nulaY, krokY, hodnotaDilkuy);//převede souřadnice myši na souřadnice na grafu
        g.fillOval(souradniceX - velikost / 2, souradniceY - velikost / 2, velikost, velikost);//vykreslí kolečko
    }

    private double hodnotaVBode(double x) { 
        return exp.evaluate(x);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
