/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menucontrols;

import byui.cit260.connect4.enums.ErrorType;
import byui.cit260.connect4.enums.HelpType;
import byui.cit260.connect4.exceptions.Connect4Exception;
import java.io.Serializable;

/**
 *
 * @author marcy
 */
public class HelpMenuControl implements Serializable {

    public String displayGameHelp(HelpType command) throws Connect4Exception {
        String helpText = "";
        switch (command) {
            case INSTRUCTIONS:
            case ONE_PERSON_GAME:
            case TWO_PERSON_GAME:
                helpText = command.displayGameHelp();
                break;
            default:
                throw new Connect4Exception(ErrorType.ERROR101.getMessage());
        }

        return helpText;
    }                  
}