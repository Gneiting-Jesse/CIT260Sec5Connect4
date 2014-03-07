/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Jesse Gneiting
 */
public class PlayerNameMenu implements Serializable{
    private String player1name;
    private String player2name;

    public PlayerNameMenu() {
    }

     public String getPlayer1name() {
        return player1name;
    }

    public void setPlayer1name(String player1name) {
        this.player1name = player1name;
    }

    public String getPlayer2name() {
        return player2name;
    }

    public void setPlayer2name(String player2name) {
        this.player2name = player2name;
    }
   
    public static void mainMeth() {
        PlayerNameMenu setupPlayers = new PlayerNameMenu();
        setupPlayers.getPlayerNames();
        setupPlayers.displayPlayerNames();
               
    }

    public void getPlayerNames() {
        Scanner inFile = Connect4.getInputFile();
        System.out.println("Enter Name of Player 1: ");
        System.out.println("Enter Name of Player 2: ");
        this.player1name = inFile.next();
        this.player2name = inFile.next();
        
    }
    public void displayPlayerNames() {
        System.out.println("\nThis game is between " + this.player1name + " as Player 1 and \n"
                + this.player2name + " as Player 2. Let the battle of the "
                + "minds begin!!!");
    }
            
}
