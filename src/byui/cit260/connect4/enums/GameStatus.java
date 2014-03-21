/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.enums;

/**
 *
 * @author marcy
 */
public enum GameStatus {
    NEW_GAME ("NEW_GAME"),
    PLAYINGORDER ("PLAYINGORDER"),
    WINNER ("WINNER"),
    TIE ("TIE"),
    QUIT ("QUIT"),
    ERROR ("ERROR");
    
    String value;
    
    GameStatus(String value) {
        this. value = value;
    }
    
    public String getValue() {
        return value;
    }
}
