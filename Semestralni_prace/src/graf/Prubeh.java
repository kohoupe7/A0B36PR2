/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graf;

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

    public Prubeh(double minimum, double maximum, double krok, Graphics g, Color barva, int nulaX, int nulaY, int krokX, int krokY ) {
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
            BodGrafu k = new BodGrafu(i);
            bod.add(k);
            //System.out.println(k);
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
        souradniceX1 = prepocitat(bod.get(0).getX(), nulaX, krokX);
        souradniceY1 = prepocitat(bod.get(0).getY(), nulaY, krokY);  
        for (int i = 1; i < bod.size(); i++) {
            souradniceX2 = prepocitat(bod.get(i).getX(), nulaX, krokX);
            souradniceY2 = prepocitat(bod.get(i).getY(), nulaY, krokY);
            g.setColor(barva);
            g.drawLine(souradniceX1, souradniceY1, souradniceX2, souradniceY2);
            souradniceX1 = souradniceX2;
            souradniceY1 = souradniceY2;

        }
    }
    
    private int prepocitat(double hodnota, int nula, int krok){
    
        
    return (int)Math.round(nula+hodnota*krok);
    }
}