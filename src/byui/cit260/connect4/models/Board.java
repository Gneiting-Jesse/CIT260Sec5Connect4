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


/**
 *
 * @author Jesse
 */
public abstract class Board extends AbstractTableModel{
    

    private int rowCount = 6;
    private int columnCount = 7;
    private String name;
    private Point boardDimensions = new Point();
    private Player[][] boardLocations;

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

    public Player[][] getBoardLocations() {
        return boardLocations;
    }

    public void setBoardLocations(Player[][] boardLocations) {
        this.boardLocations = boardLocations;
    }
    
    public Player getPlayerAt(int row, int column) {
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
        this.boardLocations = new Player[noRows][noColumns];
        this.createBoardLocations(noRows, noColumns);
    }


    public void createBoardLocations(int noRows, int noColumns) {
        this.rowCount= noRows;
        this.columnCount= noColumns;
        
        // add locations to the board
        this.boardLocations = new Player[noRows][noColumns];
        // locations for every row
        for (int row = 0; row < noRows; row++) {
            //locations for every column
            for (int column = 0; column < noColumns; column++) { 
                this.boardLocations[row][column] = new Player();           
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
                Player location = this.boardLocations[row][column];
         
            }            
        }    
    }
    
    public void occupyLocation(Player player, int row, int column) throws GameException {  
        Player playerAtLocation = this.boardLocations[row][column];

        if (playerAtLocation != null) { // location already occupied
            throw new GameException(ErrorType.ERROR203.getMessage());
        }
        this.boardLocations[row][column] = player;
    }
    public class Location {
    public int row;
    public int column;
    private String value;
    private Player player;
    
    Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    String[] getCoordinates() {
        String[] coordinates = new String[2];
        Integer intRow = this.getRow() + 1;
        Integer intColumn = this.getColumn() + 1;
        coordinates[0] = intRow.toString();
        coordinates[1] = intColumn.toString();
        return coordinates;
    }}
}
