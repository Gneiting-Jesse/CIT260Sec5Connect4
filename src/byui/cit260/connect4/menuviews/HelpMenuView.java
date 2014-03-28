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
import byui.cit260.connect4.menucontrols.HelpMenuControl;
import connect4.Menu;
import java.io.Serializable;
import java.util.Scanner;

public abstract class HelpMenuView extends Menu implements Serializable {
        
    static final String[][] menuItems = {
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

    public String executeCommands (Object object) {
    // display the help menu and get the end users input selection             
        String command = null;
        Scanner inFile = Connect4.getInputFile();
        
        do {
            try {
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
                    throw new MenuException(ErrorType.ERROR101.getMessage());
            }
            }
             catch (MenuException e) {
                System.out.println("\n" + e.getMessage());
            }
        } while (!command.equals("Q"));  
        return ("Q");
    }
}