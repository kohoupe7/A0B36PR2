/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graf;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author petr
 */
public class BodGrafu {

    double x, y;

    public BodGrafu(double x) {
        this.x = x;
        y = hodnotaVBode(x);
    }

    public BodGrafu(double x, int nulaX, int krokX, int nulaY, int krokY, Graphics g, int velikost, Color barva) {
        this.x = x;
        y = hodnotaVBode(x);
       //System.out.println(x);
        g.setColor(barva);
    //g.fillOval((int)x-velikost, (int)Math.round(nulaY+y*krokY)-velikost, (int)x, (int)Math.round(nulaY+y*krokY)+velikost);
    }
    

    private double hodnotaVBode(double x) {
        
        
        return Math.sin(x);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return x+" "+y; //To change body of generated methods, choose Tools | Templates.
    }
    
}
