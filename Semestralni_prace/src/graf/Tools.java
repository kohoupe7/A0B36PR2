package graf;

public class Tools {

    public static double pxToSour(double px, int nula, int krok, char osa, double hodnotaDilku) {
        return osa == 'y' ? (-1 * ((px - nula) / krok)) * hodnotaDilku : ((px - nula) / krok) * hodnotaDilku;
    }//Převádí sořadnice na panelu na souřadnice klasické 

    public static int sourToPx(double sour, int nula, int krok, double hodnotaDilku) {
        return (int) Math.round(nula + sour / hodnotaDilku * krok);
    }//převádí klasické souřadnice na fyzické souřadnice na vykreslovacím panelu
}
