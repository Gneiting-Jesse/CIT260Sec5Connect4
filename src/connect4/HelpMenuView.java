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
import java.util.Scanner;

public class HelpMenuView {
        
    private final static String[][] menuItems = {
        {"G", "Game Objective"},
        {"1", "1 Player Game"}, 
        {"2", "2 Player Game"},      
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    public static void main(String[] args) {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;
                case "1":
                    this.helpMenuControl.display1PlayerHelp();
                    break;
                case "2":
                    this.helpMenuControl.display2PlayerHelp();
                case "Q": 
                    break;
                default: 
                    new Connect4Error().displayError("Invalid choice. Please enter a valid option.");
            }
        } while (!command.equals("Q"));  
    }

        // displays the help menu
    public final void display() {
        System.out.println("\tEnter the character associated with one of the following options:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
    }
  
}

