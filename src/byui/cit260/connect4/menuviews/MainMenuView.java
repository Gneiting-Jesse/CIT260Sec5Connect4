/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menuviews;

import byui.cit260.connect4.enums.ErrorType;
import byui.cit260.connect4.exceptions.Connect4Exception;
import connect4.Connect4;
import byui.cit260.connect4.menucontrols.MainMenuControl;
import connect4.Menu;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public abstract class MainMenuView extends Menu implements Serializable {
    

    private static final String[][] menuItems = {
        {"1", "Begin a One player game"},
        {"2", "Begin a Two player game"},
        {"T", "Take Quiz"},
        {"H", "Help"},
        {"Q", "Quit"}
    
    };
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);

    }

    public MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    public void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }
        
    public String executeCommands(Object object) {
        String command = null;
        Scanner inFile = Connect4.getInputFile();
        
        do {
            try {
            this.display(); // display the menu

            // get input
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    this.mainMenuControl.startOnePlayerGame();
                    break;
                case "2":
                    this.mainMenuControl.startTwoPlayerGame();
                    break;
                case "T":
                    this.mainMenuControl.getAnswers();
                case "H":
                    this.mainMenuControl.displayHelpMenu();            
                    break;
                case "Q":
                    return "Q";
            }
            }
             catch (Exception e) {
                System.out.println("\n" + e.getMessage());
            }
            } while (!command.equals("Q"));
        return ("Q");
    }
       
}