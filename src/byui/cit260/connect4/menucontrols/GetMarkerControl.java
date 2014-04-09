/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menucontrols;

import byui.cit260.connect4.enums.ErrorType;
import byui.cit260.connect4.enums.GameStatus;
import byui.cit260.connect4.exceptions.GameException;
import byui.cit260.connect4.models.Game;
import byui.cit260.connect4.models.Player;
/**
 *
 * @author marcy
 */
public class GetMarkerControl {
    Game game;


public GetMarkerControl(Game game) {
    this.game = game;
}

public GetMarkerControl(String player1Marker, String player2Marker)
    throws GameException {
    if (player1Marker == null || player1Marker.length() < 1) {
        throw new GameException(ErrorType.ERROR105.getMessage());
}
    player1Marker = player1Marker.substring(0, 1).toUpperCase();
    
    if (player2Marker == null || player2Marker.length() < 1) {
        throw new GameException(ErrorType.ERROR105.getMessage());
}
    player2Marker = player2Marker.substring(0, 1).toUpperCase();
    
    if (player1Marker.equals(player2Marker)) {
        throw new GameException(ErrorType.ERROR106.getMessage());
    }
    
    this.game.getPlayer1().setMarker(player1Marker);
    this.game.getPlayer2().setMarker(player2Marker);
}
}