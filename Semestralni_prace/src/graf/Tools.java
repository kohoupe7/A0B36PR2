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

    public static double pxToSour(double px, int nula, int krok, char osa, double hodnotaDilku) {
        return osa == 'y' ? (-1 * ((px - nula) / krok)) * hodnotaDilku : ((px - nula) / krok) * hodnotaDilku;
    }

    public static int sourToPx(double sour, int nula, int krok, double hodnotaDilku) {
        return (int) Math.round(nula + sour / hodnotaDilku * krok);
    }
}
