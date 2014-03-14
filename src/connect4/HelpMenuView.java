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

public abstract class HelpMenuView extends Menu implements Serializable {
        
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
        super(HelpMenuView.menuItems);
        
    } 

    public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }

    public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }
    @Override
    public String executeCommands (Object object) {
    // display the help menu and get the end users input selection             
        String command;
        Scanner inFile = Connect4.getInputFile();
        
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
                    System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\tError. Invalid choice. Please enter a valid option.");
                    System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            }
        } while (!command.equals("Q"));  
        return ("Q");
    }
}