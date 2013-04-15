/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptions;

/**
 *
 * @author petr
 */
public class ChybiOperandExep extends RuntimeException{

    public ChybiOperandExep(String message) {
        super(message);
    }
    
}
