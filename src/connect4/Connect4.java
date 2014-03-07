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
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Connect4 {

    // Instance variables
    String instructions = "\t\t\t Welcome to Connect4!\n\n"
            + "\tYou will have the option of choosing a 1 player game or\n"
            + "\ta 2 player game. Each player will have a different game\n"
            + "\tpiece. The object of the game is to place 4 of your game\n"
            + "\tpieces consecutively in a line either vertically,\n"
            + "\thorizontally or diagonally.\n\n"
            + "\tGood Luck!\n\n";
    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
        myGame.displayHelp();
        // TODO code application logic here
    }

    public void displayHelp () {
         System.out.println(this.instructions);
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
    }
}
