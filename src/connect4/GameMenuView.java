/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;
//I THINK WE CAN GET RID OF THIS.
/**
 *
 * @author marcy
 */
import java.io.Serializable;
import java.util.Scanner;

public class GameMenuView implements Serializable{
    private final static String[][] gamemenuItems = {
        {"N", "New Game"},
        {"S", "Statistics"},
        {"H", "Help"},
        {"Q", "Quit"}
    };

    //create instance of the GameMenuControl class
    private GameMenuControl gameMenuControl = new GameMenuControl();
    
    //default constructor
    public GameMenuView(){
        
    }

    public GameMenuControl getGameMenuControl() {
        return gameMenuControl;
    }

    public void setGameMenuControl(GameMenuControl gameMenuControl) {
        this.gameMenuControl = gameMenuControl;
    }
    
    public static void mainMeth() {
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.getInput();
    }
    //display game menu and get users input
    public void getInput() {
        String command;
        Scanner inFile = Connect4.getInputFile(); 
        
        do {
            this.display(); //displays the menu
            
            //get input
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch(command) {
                case "N":
                    this.gameMenuControl.displayNewGame();
                    break;
                case "S":
                    this.gameMenuControl.displayStatistics();
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
    }
    //displays the menu
    public final void display(){
        System.out.println("Enter the character associated with one of the following options:\n");
        
        for (int i = 0; i < GameMenuView.gamemenuItems.length; i++) {
            System.out.println("\t    " + gamemenuItems[i][0] + "\t" + gamemenuItems[i][1]);
        }
    }
}

