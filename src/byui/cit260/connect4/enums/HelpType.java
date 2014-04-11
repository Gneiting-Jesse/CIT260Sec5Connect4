/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.enums;

/**
 *
 * @author Owner
 */
public enum HelpType {
    INSTRUCTIONS ("\nYou will have the option of choosing a 1 player game or "
            + "2 player game. Each player will have a different game "
            + "piece. The object of the game is to place 4 of your game "
            + "pieces consecutively in a line either vertically, "
            + "horizontally or diagonally.\n\n "
            + "\tGood Luck!" ),
          
        ONE_PERSON_GAME ("\nIn a one person game, you will play against the computer."),

        TWO_PERSON_GAME ("\nIn a two person game, you will play against another real player.");
        
        String helpText;

    private HelpType(String helpText) {
        this.helpText = helpText;
    }

    public String displayGameHelp(){
        return helpText;
    }
    
}
