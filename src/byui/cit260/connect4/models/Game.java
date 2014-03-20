/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.models;

import byui.cit260.connect4.models.Board;
import java.io.Serializable;

/**
 *
 * @author marcy
 */
public class Game implements Serializable{
    public static final String PLAYER_1_DEFAULT_MARKER = "X";
    public static final String PLAYER_2_DEFAULT_MARKER = "O";
    
    public static final String ONE_PLAYER = "ONE PLAYER";
    public static final String TWO_PLAYER = "TWO PLAYER";
    
    public static final String NEW_GAME = "NEW GAME";
    public static final String PLAYINGORDER = "PLAYINGORDER";
    public static final String WINNER = "WINNER";
    public static final String TIE = "TIE";
    public static final String QUIT = "QUIT";
    public static final String ERROR = "ERROR";
    
    private String gameType;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Player otherPlayer;
    private Player winner;
    private Player loser;
    private String status;
    private Board board;
    
    public Game() {
        this.player1 = new Player();
        this.player2 = new Player();
        
        this.player1.setMarker(Game.PLAYER_1_DEFAULT_MARKER);
        this.player2.setMarker(Game.PLAYER_2_DEFAULT_MARKER);
        
    }
    
    public Game(String gameType) {
        this();
        this.gameType = gameType;
        this.board = new Board(6, 7);
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    
    public void startGame() {
        this.setPlayingOrder(player1, player2);
        this.board.clearTheBoard();
        this.setStatus(Game.NEW_GAME);
        
    }
    
    public void setPlayingOrder(Player player1, Player player2) {
        double randomValue = Math.random();
        
        if (randomValue < .5) {
            this.currentPlayer = player1;
            this.otherPlayer = player2;
         }
        else {
            this.otherPlayer = player2;
            this.currentPlayer = player1;
        }
    }
    
    public void recordWinner() {
        if (this.currentPlayer == this.player1) {
            this.winner = this.player1;
            this.loser = this.player2;
        }
        else {
            this.winner = this.player2;
            this.loser = this.player1;
        }
        long noWins = this.winner.getWins();
        noWins++;
        this.winner.setWins(noWins);
        long noLosses = this.loser.getLosses();
        noLosses++;
        this.loser.setLosses(noLosses);
        
        this.setStatus(Game.WINNER);
    }
    
    public void recordTie() {
        long player1Ties = this.player1.getTies();
        player1Ties++;
        this.player1.setTies(player1Ties);
        
        long player2Ties = this.player2.getTies();
        player2Ties++;
        this.player2.setTies(player2Ties);
        
        this.setStatus(Game.TIE);
    }
    
    public String getWinningMessage() {
        return "Congratulations " + winner.getName()+ "! You won!";
    }
    
    public String getTiedMessage() {
        return "This is a tied game.";
    }
}
