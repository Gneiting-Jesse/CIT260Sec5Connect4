/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Connect4 {

    // Instance variables
    String name;
    String instructions = "This is a game of Connect4.\n\n"
            + "You will have the option of choosing a 1 player game or\n"
            + "a 2 player game. Each player will have a different colored\n"
            + "circular disc with the object of the game to place 4 of your\n"
            + "discs consecutively in a line either vertically,\n"
            + "horizontally or diagonally.\n\n"
            + "Good Luck!\n\n";
    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
        myGame.getName();
        myGame.displayHelp();
        // TODO code application logic here
    }
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        
    }
    public void displayHelp () {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}
