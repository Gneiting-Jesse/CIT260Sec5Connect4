/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Jesse Gneiting
 */
public class MainMenu {
     // Instance variables
    String gameSetup = "Each player will have a different colored circular\n"
            + "disc with the object of the game to place 4 of your\n"
            + "discs consecutively in a line either vertically, horizontally\n"
            + "or diagonally.\n\n"
            + "Good Luck!\n\n";
    String selectPlayers;
    public static void main(String[] args) {
        MainMenu setupGame = new MainMenu();
        setupGame.getNumberOfPlayers();
        setupGame.displayGameSetup();
        // TODO code application logic here
    }
    public void getNumberOfPlayers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of players: ");
        this.selectPlayers = input.next();
        
    }
    public void displayGameSetup () {
        System.out.println("This game is set up with " + this.selectPlayers + " players.\n");
        System.out.println(this.gameSetup);
    }
}
