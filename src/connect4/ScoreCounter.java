/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author marcy
 */
public class ScoreCounter {
    short blocks; //adds 10 points for every block
    short blocked; //subtracts 5 points for every time blocked
    short threeInRow; //adds 5 points for every three-in-a-row
    int winLose; //adds 1000 points for every win
    int score;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreCounter playerScore = new ScoreCounter();
        playerScore.getScore();
        
        // TODO code application logic here
    }
    
    public void getScore() {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter number of times you blocked: ");
        this.blocks = (short) input.nextInt();
        System.out.println("Enter number of times you were blocked: ");
        this.blocked = (short) input.nextInt();
        System.out.println("Enter number of times you got three-in-a-row:");
        this.threeInRow = (short) input.nextInt();
        System.out.println("Enter a \"1\" if you won and a \"0\" if you lost:");
        this.winLose = input.nextInt();
        
        this.score = (10 * this.blocks) + (-5 * this.blocked) + (5 * this.threeInRow) + (1000 * this.winLose);
        if (this.score < 0){
        this.score = 0; 
        }
        System.out.println("\tYour total score is " + this.score + ".");
     }
   
    
}
