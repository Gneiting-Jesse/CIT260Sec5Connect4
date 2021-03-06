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
}