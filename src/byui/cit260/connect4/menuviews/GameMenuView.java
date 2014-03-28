/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menuviews;
/**
 *
 * @author marcy
 */
import byui.cit260.connect4.enums.ErrorType;
import byui.cit260.connect4.exceptions.MenuException;
import connect4.Connect4;
import byui.cit260.connect4.menucontrols.GameMenuControl;
import connect4.Menu;
import java.io.Serializable;
import java.util.Scanner;

public abstract class GameMenuView extends Menu implements Serializable{
    private final static String[][] menuItems = {
        {"M", "Get Marker"},
        {"N", "Enter Name"},
        {"B", "Begin Game"},
        {"H", "Help"},
        {"Q", "Quit"}
    };

    //create instance of the GameMenuControl class
    private GameMenuControl gameMenuControl = new GameMenuControl();
    
    //default constructor
    public GameMenuView(){
        super(GameMenuView.menuItems);
    }

    public GameMenuControl getGameMenuControl() {
        return gameMenuControl;
    }

    public void setGameMenuControl(GameMenuControl gameMenuControl) {
        this.gameMenuControl = gameMenuControl;
    }
    
        public String excecuteCommands(Object object) {
        String command = null;
        Scanner inFile = Connect4.getInputFile(); 
        
        do {     
            try {
            this.display(); //displays the menu
            
            //get input
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch(command) {
                case "M":
                    this.gameMenuControl.displayGetMarker();
                    break;
                case "N":
                    this.gameMenuControl.displayPlayerName();
                    break;
                case "H":
                    this.gameMenuControl.displayHelpMenu();
                    break;
                case "Q":
                    break;
                default:
                    throw new MenuException(ErrorType.ERROR101.getMessage());
            }
            }
             catch (MenuException e) {
                System.out.println("\n" + e.getMessage());
                     }
        }while (!command.equals("Q"));
        return ("Q");
    }
}

