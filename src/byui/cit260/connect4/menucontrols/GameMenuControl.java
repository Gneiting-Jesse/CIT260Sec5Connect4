/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menucontrols;

import byui.cit260.connect4.exceptions.MenuException;
import byui.cit260.connect4.interfaces.DisplayHelpMenu;
import byui.cit260.connect4.menuviews.GetMarkerView;
import byui.cit260.connect4.menuviews.HelpMenuView;
import byui.cit260.connect4.menuviews.PlayerNameMenu;
import byui.cit260.connect4.models.Game;
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

    public GameMenuControl(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void displayGetMarker() {
        GetMarkerView getMarker = new GetMarkerView();
         getMarker.getInput();
        
    }
     public void displayPlayerName() {
        PlayerNameMenu setupPlayers = new PlayerNameMenu();
        setupPlayers.getPlayerNames();
        setupPlayers.displayPlayerNames();
        
    }
    
    public void beginGame() {
        
        System.out.println("\tstub. This option would allow the user\n"
                           +"\tto play a new game.");
        
    }
       
    @Override
    public void displayHelpMenu() {
        
        HelpMenuView helpMenu = new HelpMenuView() {

             @Override
             public void getInput() {
             }
         };
        helpMenu.executeCommands(null);
    }
    
}
   
