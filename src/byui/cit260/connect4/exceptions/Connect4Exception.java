/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.exceptions;

/**
 *
 * @author Owner
 */
public class Connect4Exception extends Exception {
     public Connect4Exception() {
    }

    public Connect4Exception(String message) {
        super(message);
    }

    public Connect4Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Connect4Exception(Throwable cause) {
        super(cause);
    }
    
}
