/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.models;

import byui.cit260.connect4.enums.ErrorType;
import byui.cit260.connect4.exceptions.GameException;
import java.awt.Point;
import javax.swing.table.AbstractTableModel;
import java.io.Serializable;


/**
 *
 * @author Jesse
 */
public abstract class Board extends AbstractTableModel{
    

    private int rowCount = 6;
    private int columnCount = 7;
    private String name;
    private Point boardDimensions = new Point();
    private Location[][] boardLocations;

    public Board() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Location[][] getBoardLocations() {
        return boardLocations;
    }

    public void setBoardLocations(Location[][] boardLocations) {
        this.boardLocations = boardLocations;
    }
    
    public Location getPlayerAt(int row, int column) {
        return this.boardLocations[row][column];
    }
    
    public static void mainMeth() {
       Board board = new Board() {

           @Override
           public Object getValueAt(int i, int i1) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       };
       board.displayBoard();
       
    }

    public Board(int noRows, int noColumns) {
        this.boardDimensions.setLocation(noRows, noRows);
        this.boardLocations = new Location[noRows][noColumns];
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
    
    public void occupyLocation(Location player, int row, int column) throws GameException {
        Location playerAtLocation = this.boardLocations[row][column];
        
        if (playerAtLocation != null) {
            throw new GameException(ErrorType.ERROR104.getMessage());
        }
        this.boardLocations[row][column] = player;
    }
}
