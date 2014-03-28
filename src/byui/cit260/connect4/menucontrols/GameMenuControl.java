/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menucontrols;

import byui.cit260.connect4.exceptions.MenuException;
import byui.cit260.connect4.interfaces.DisplayHelpMenu;
import byui.cit260.connect4.menuviews.HelpMenuView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcy
 */
public class GameMenuControl implements DisplayHelpMenu{
    
    //default constructor
    public GameMenuControl(){
        
    }
    
    public void displayGetMarker() {
         System.out.println("\tstub. This woudl display the marker\n");
        
    }
    
    public void displayBeginGame() {
        
        System.out.println("\tstub. This option would allow the user\n"
                           +"\tto play a new game.");
        
    }
    
    public void displayStatistics() {
        
        System.out.println("\tstub. This option would allow the user\n"
                           + "\tto go to the Statistics page.");
        
    }
    
    @Override
    public void displayHelpMenu() {
        
        HelpMenuView helpMenu = new HelpMenuView() {

             @Override
             public void getInput() {
             }
         };
        try {
            helpMenu.executeCommands(null);
        } catch (MenuException ex) {
            Logger.getLogger(GameMenuControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void displayPlayerName() {
         System.out.println("\tstub. This would display the players\n"
                           + "\tname on the line.");
        
    }
    
}
