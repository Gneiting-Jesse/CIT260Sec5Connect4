/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;
/**
 *
 * @author marcy
 */
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
        String command;
        Scanner inFile = Connect4.getInputFile(); 
        
        do {
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
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Error. Invalid choice. Please enter a valid option.");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            }
        }while (!command.equals("Q"));
        return ("Q");
    }
}

