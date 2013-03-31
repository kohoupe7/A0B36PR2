/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graf;

/**
 *
 * @author petr
 */
public class Tools {
    public static double pxToSour(double px, int nula, int krok, char osa){
    return osa=='y'?-1*((px-nula)/krok):(px-nula)/krok;
    }
     public static int sourToPx(double sour, int nula, int krok){
    return (int)Math.round(nula+sour*krok);
    }
}
