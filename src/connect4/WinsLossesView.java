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
public class WinsLossesView {
    char player;
    
public Board board = new Board();
public GameView game = new GameView();

public WinsLossesView(){

}

public static void main(String[] args) {
    WinsLossesView winLoss = new WinsLossesView();
        winLoss.winner();
        winLoss.tiedGame();
    }

private boolean winner() {
    Location[][] locations = this.board.boardLocations;
    
    for (int row = 0; row < locations.length; row++) {
        Location[] rowLocations = locations[row];
        
        for (int col = 0; col < rowLocations.length; col++) {
            if(fourInARow (row, col, locations)) { //fourInARow method will come later
                return true;
            }
        }
    }
    return false;
}

private boolean tiedGame(){
    Location [][] locations = this.board.boardLocations;
    
    for (int row = 0; row < locations.length; row++) {
        Location[] rowLocations = locations[row];
        
        for (int col = 0; col < rowLocations.length; col++) {
            Location location = rowLocations[col];
            if (locations[row][col].player == null){ //this variable will be filled later.
                return false;
        }
    }
}
return true;
}
}

