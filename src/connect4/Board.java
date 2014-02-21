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
public class Board {
    

    public int rowCount = 6;
    public int columnCount = 7;
   
    public Location[][] boardLocations;

    public Board() {
    }
     public static void main(String[] args) {
       Board board = new Board();
       board.displayBoard();
       
    }

    public Board(int noRows, int noColumns) {
  
        this.createBoardLocations(noRows, noColumns);
    }


    public void createBoardLocations(int noRows, int noColumns) {
        this.rowCount= noRows;
        this.columnCount= noColumns;
        
        // add locations to the board
        this.boardLocations = new Location[noRows][noColumns];
        // locations for every row
        for (int row = 0; row < noRows; row++) {
            //locations for every column
            for (int column = 0; column < noColumns; column++) { 
                this.boardLocations[row][column] = new Location();           
            }            
        }   
    }
    
    public void displayBoard() {
        Scanner inFile = new Scanner(System.in);
        
            int t, i;
            int val = 5;
            int board[][] = new int[6][7];
            boolean found = false;
        
            for(t = 0; t < 6; ++t) {
                for(i = 0; i < 7; ++i) {
                    board[t][i] = (t * 7) + i + 1;
                    System.out.print(board[t][i] + "\t");
            }
            System.out.println("\n\n");
            
        }
           
    }
    // method for clearing locations still need to add player class to 
    // help clear the board
    public void clearTheBoard() {
        for (int row = 0; row < this.rowCount; row++) {
            for (int column = 0; column < this.columnCount; column++) {
                Location location = this.boardLocations[row][column];
         
            }            
        }    
    }
}
