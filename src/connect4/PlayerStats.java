/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author jesse
 */
public class PlayerStats {
    long wins;
    long losses;
    int totalGamesPlayed;
    float percentage;


    public static void main(String[] args) {
    PlayerStats winStats = new PlayerStats();
    winStats.getStats();
    }


    public void getStats(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number of Wins: ");
        this.wins = reader.nextInt();
        if (this.wins < 0) {
            System.out.println("Invalid number of wins \n");
        }
        System.out.println("Enter Number of Losses: ");
        this.losses = reader.nextInt();
        if (this.losses < 0) {
            System.out.println("Invalid number of Losses \n");
        }
        totalGamesPlayed = (int) (this.wins + this.losses);
        System.out.println("The total games played is " + totalGamesPlayed);
        if (this.totalGamesPlayed < 0) {
            System.out.println("Invalid number of Games Played \n");
        }
        percentage = (this.wins * 100/ this.totalGamesPlayed);
            System.out.println("\"Wow\" Your winning percentage is " + percentage + "%"
                + "\nThat is a great job!!!");
    }
}