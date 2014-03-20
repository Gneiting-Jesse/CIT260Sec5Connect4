/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menucontrols;

import byui.cit260.connect4.menuviews.HelpMenuView;

/**
 *
 * @author marcy
 */
public class GameMenuControl {
    
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
    
    public void displayHelpMenu() {
        
        HelpMenuView helpMenu = new HelpMenuView() {

             @Override
             public void getInput() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         };
        helpMenu.executeCommands(null);
    }
    
    public void displayPlayerName() {
         System.out.println("\tstub. This would display the players\n"
                           + "\tname on the line.");
        
    }
    
}
