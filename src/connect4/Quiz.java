/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class Quiz {
    String question1, question2, question3, question4, question5;
    int correctAns = 100;
    short points;
    short totalPoints = 500;
    float quizPercentage;
    
     public static void main(String[] args) {
       Quiz gameQuiz = new Quiz();
        gameQuiz.getAnswers(); 
     }
        
    public void getAnswers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Connect 4 Quiz \n Please answer all questions with a "
                + "\'True or False\' answer.\n");
        System.out.println("Question #1: This game is only played with 1 player.");
        this.question1 = input.next();
        switch (question1) {
            case "False":
                System.out.println("Correct\n");
                points = (short) (points + correctAns);
                break;
            case "True":
                System.out.println("Incorrect\n");
                break;
            default:
                System.out.println("Invalid Entry\n");
                break;
        }
        System.out.println("Question #2: The first player to score 4 discs in\n"
                + "a row either vertically, horizontally or diagonally in the winner.");
        this.question2 = input.next();
        switch (question2) {
            case "True":
                System.out.println("Correct\n");
                points = (short) (points + correctAns);
                break;
            case "False":
                System.out.println("Incorrect\n");
                break;
            default:
                System.out.println("Invalid Entry\n");
                break;
        }
        System.out.println("Question #3: A player may not take two turns consecutively.");
        this.question3 = input.next();
        switch (question3) {
            case "True":
                System.out.println("Correct\n");
                points = (short) (points + correctAns);
                break;
            case "False":
                System.out.println("Incorrect\n");
                break;
            default:
                System.out.println("Invalid Entry\n");
                break;
        }
        System.out.println("Question #4: A player may not undo a turn once taken.");
        this.question4 = input.next();
        switch (question4) {
            case "True":
                System.out.println("Correct\n");
                points = (short) (points + correctAns);
                break;
            case "False":
                System.out.println("Incorrect\n");
                break;
            default:
                System.out.println("Invalid Entry\n");
                break;
        }
        System.out.println("Question #5: Connect 4 is exactly the same as Tic Tac Toe.");
        this.question5 = input.next();
        switch (question5) {
            case "False":
                System.out.println("Correct\n");
                points = (short) (points + correctAns);
                break;
            case "True":
                System.out.println("Incorrect\n");
                break;
            default:
                System.out.println("Invalid Entry\n");
                break;
        }
        quizPercentage = (this.points * 100 / this.totalPoints);
        System.out.println("\tYour Quiz Score is "+ this.points + ". This gives you a " + this.quizPercentage + "%");
        if (this.quizPercentage <= 60) {
        System.out.println("\tFailing Grade - Please retake the quiz.");
        }
        else System.out.println("\tYou PASSED Congratulations!");
    }
        
}