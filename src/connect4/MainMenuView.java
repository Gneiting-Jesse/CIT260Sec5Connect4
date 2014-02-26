/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class MainMenuView {
    

    private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"Q", "Quit"}
    
    };
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {

    }
    
    public void mainMeth() {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.getInput();
    }
    public void getInput() {
        String command;
        Scanner inFile = new Scanner(System.in);
        
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
        System.out.println("\tEnter the character associated with one of the following options:\n");
        
        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t    " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
    }
}