/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.models;

import byui.cit260.connect4.enums.PlayerType;
import java.io.Serializable;

/**
 *
 * @author marcy
 */
public class Player implements Serializable {
    
    public static final String HUMAN_PLAYER = "HUMAN";
    public static final String COMPUTER_PLAYER = "COMPUTER";
    
    private String name;
    private String playerType;
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private String marker;
    
    public Player () {
        
    }
    
    public Player(String playerType, String marker) {
        this.playerType = playerType;
        this.marker = marker;
    }

    public Player(PlayerType playerType, String PLAYER_1_DEFAULT_MARKER) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }


    
}
