/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.enums;

/**
 *
 * @author Jesse
 */
public enum ErrorType {
    
    ERROR101 ("\tInvalid command. Please enter a valid command."),
    
    ERROR102 ("\tInvalid command in the Help Menu. Returned back to the Main Menu."),
    
    ERROR103 ("\tInvalid command in the Game Menu. Returned back to the Main Menu."),
    
    ERROR104 ("\tThis location is already occupied. Try again."),
    
    ERROR105 ("\tEnter a non-blank character for the maker."),
    
    ERROR106 ("\tBoth players cannot use the same character for the marker."),
    
    ERROR107 ("\tPlease start a new game first."),
    
    ERROR108 ("\tInvalid player type."),
    
    ERROR109 ("\tYou must start a new game before you can take a turn."),
    
    ERROR110 ("\t\"There aren't any empty locations found on the board."),
    
    ERROR203 ("This location is already occupied. Try a different location.");
    
    String message;
    
    ErrorType(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }

    
    public static void displayErorrMsg(String errorMessage) {
        String fullMessage = "\t+ ERROR: " + errorMessage + " +";
        int dividerLineLength = fullMessage.length();
        StringBuilder dividerLine = new StringBuilder(dividerLineLength);
        for (int i = 0; i < dividerLineLength; i++) {
            dividerLine.insert(i, '+');
        }
        System.out.println("\t" + dividerLine.toString());
        System.out.println(fullMessage);
        System.out.println("\t" + dividerLine.toString());
    }
    
    }

