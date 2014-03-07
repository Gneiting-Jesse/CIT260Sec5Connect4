/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class MainMenuView implements Serializable {
    

    private static final String[][] menuItems = {
        {"1", "Begin a One player game"},
        {"2", "Begin a Two player game"},
        {"T", "Take Quiz"},
        {"H", "Help"},
        {"Q", "Quit"}
    
    };
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {

    }
   
    public MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    public void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }
        
    public void mainMeth() {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.getInput();
    }
    public void getInput() {
        String command;
        Scanner inFile = Connect4.getInputFile();
        
        do {
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
                    break;
                default: 
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Error. Invalid choice. Please enter a valid option.");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");                    
            }
            } while (!command.equals("Q"));
    }
    
     public final void display(){
         System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("\tEnter the character associated with one of the following options:");
         System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        
        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t    " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
    }
}