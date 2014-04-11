/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menucontrols;

import byui.cit260.connect4.enums.GameType;
import byui.cit260.connect4.enums.PlayerType;
import byui.cit260.connect4.interfaces.DisplayHelpMenu;
import byui.cit260.connect4.menuviews.HelpMenuView;
import byui.cit260.connect4.models.Game;
import byui.cit260.connect4.models.Player;
import connect4.Quiz;

/**
 *
 * @author Jesse
 */
public class MainMenuControl implements DisplayHelpMenu {
    
    private static final String PLAYER_1_DEFAULT_MARKER = "X";
    private static final String PLAYER_2_DEFAULT_MARKER = "O";
    
    public Game create(GameType gameType) {
        Game game = null;
        Player player1 = null;
        Player player2 = null;
        
        if (gameType == null) {
            throw new IllegalArgumentException ("MainCommands - create: gameType is null");
        }
        
        if (gameType == GameType.ONE_PLAYER) {
            game = new Game(GameType.ONE_PLAYER);
            player1 = new Player(PlayerType.REGULAR_PLAYER, PLAYER_1_DEFAULT_MARKER);
            player2 = new Player(PlayerType.COMPUTER_PLAYER, PLAYER_2_DEFAULT_MARKER);
        }
        else if (gameType == GameType.TWO_PLAYER) {
            game = new Game(GameType.TWO_PLAYER);
            player1 = new Player(PlayerType.REGULAR_PLAYER, PLAYER_1_DEFAULT_MARKER);
            player2 = new Player(PlayerType.REGULAR_PLAYER, PLAYER_2_DEFAULT_MARKER);

        }
         
        game.setPlayer1(player1);
        game.setPlayer2(player2);
        
        return game;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}