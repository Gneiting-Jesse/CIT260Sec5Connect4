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
public class PlayerNameMenu {
    String player1name;
    String player2name;
    
    public static void main(String[] args) {
        PlayerNameMenu setupPlayers = new PlayerNameMenu();
        setupPlayers.getPlayerNames();
        setupPlayers.displayPlayerNames();
               
    }
    public void getPlayerNames() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name of Player 1: ");
        System.out.println("Enter Name of Player 2: ");
        this.player1name = input.next();
        this.player2name = input.next();
        
    }
    public void displayPlayerNames() {
        System.out.println("\nThis game is between " + this.player1name + " as Player 1 and \n"
                + this.player2name + " as Player 2. Let the battle of the "
                + "minds begin!!!");
    }
            
}
