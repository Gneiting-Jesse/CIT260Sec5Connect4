/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

/**
 *
 * @author marcy
 */
public class PlayerStats {
    int wins;
    int losses;
    int percentage;

public static void main(Strings[] args) {
    PlayerStats winStats = new PlayerStats();
    winStats.displayWins();
}

public void displayWins(){
    wins = 3;
    losses = 7;
int totalWins = this.wins - this.losses;

System.out.println("The total wins is " + totalWins);
}

public void displayPercentage() {
percentage = (double) (this.wins/(this.wins + this.losses));

System.out.println("The percentage of wins is " + percentage);
}

    private static class Strings {

        public Strings() {
        }
    }
}
