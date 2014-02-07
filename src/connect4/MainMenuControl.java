/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

/**
 *
 * @author Jesse
 */
public class MainMenuControl {
    
    public MainMenuControl(){
        
    }
    
     public void startOnePlayerGame() {
        
        System.out.println("\tThis option would allow the user\n"
                           +"\tto start a One Player Game.\n");
        
    }
    
    public void startTwoPlayerGame() {
        
        System.out.println("\tThis option would allow the user\n"
                           + "\tto start a Two Player Game.\n");
        
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
}
