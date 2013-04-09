/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.ArrayList;

/**
 *
 * @author petr
 */
public class Tools {

    public static ArrayList naplnArrayList(String input) {

        boolean isDigit = false;
        ArrayList ret = new ArrayList();
        String cast = null;

        for (int i = 0; i < input.length(); i++) {
            cast = isDigit ? cast + input.charAt(i) : Character.toString(input.charAt(i));

            if ((i + 1 != input.length()) && (Character.isDigit(input.charAt(i)) || input.charAt(i) == '.') && (Character.isDigit(input.charAt(i + 1)) || input.charAt(i + 1) == '.')) {
                isDigit = true;
            } else {
                isDigit = false;
                ret.add(cast);
                cast = null;
            }
        }
        return ret;
    }
}
