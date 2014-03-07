/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

/**
 *
 * @author Jesse Gneiting and Marcy Jagielski
 */
import java.io.Serializable;
import java.util.Scanner;

public class Connect4 implements Serializable {
    private static Scanner inFile = new Scanner(System.in);
    // Instance variables
    private String instructions = "\t\t\t Welcome to Connect4!\n\n"
            + "\tYou will have the option of choosing a 1 player game or\n"
            + "\ta 2 player game. Each player will have a different game\n"
            + "\tpiece. The object of the game is to place 4 of your game\n"
            + "\tpieces consecutively in a line either vertically,\n"
            + "\thorizontally or diagonally.\n\n"
            + "\tGood Luck!\n\n";

    public Connect4() {
    }

    public static Scanner getInputFile() {
        return inFile;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
        
    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
        myGame.displayHelp();
        // TODO code application logic here
    }

    private void displayHelp () {
         System.out.println(this.instructions);
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
    }
}
