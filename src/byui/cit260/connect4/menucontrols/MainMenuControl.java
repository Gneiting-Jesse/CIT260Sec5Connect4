/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menucontrols;

import byui.cit260.connect4.menuviews.HelpMenuView;
import connect4.Quiz;
import java.io.Serializable;

/**
 *
 * @author Jesse
 */
public class MainMenuControl implements Serializable {
    
    private Quiz quiz = new Quiz();
    
    public MainMenuControl(){
        
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
    
    
     public void startOnePlayerGame() {
        
        System.out.println("\tThis option would allow the user\n"
                           +"\tto start a One Player Game.\n");
        
    }
    
    public void startTwoPlayerGame() {
        
        System.out.println("\tThis option would allow the user\n"
                           + "\tto start a Two Player Game.\n");
        
    }
    
    public void getAnswers() {
        Quiz quiz = new Quiz();
        quiz.getAnswers();
        
    }
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView() {

             @Override
             public void getInput() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         };
        helpMenu.executeCommands(null);
    } 
}

