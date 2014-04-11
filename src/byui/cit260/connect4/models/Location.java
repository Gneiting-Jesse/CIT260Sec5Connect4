/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.models;

/**
 *
 * @author Marcy and Jesse
 */
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
    }
}