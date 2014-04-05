/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menucontrols;

import byui.cit260.connect4.models.Game;
import byui.cit260.connect4.models.Player;

/**
 *
 * @author Jesse
 */
public class PlayerNameMenuControl {
    public static void savePlayersNames(Game game, String playerAName, String playerBName) {
       if (game == null 
               || playerAName == null
               || playerBName == null) {
           throw new IllegalArgumentException("savePlayersNames - parameter value is null");
       }
       Player player1 = game.getPlayer1();
       Player player2 = game.getPlayer2();
       player1.setName(playerAName);
       player2.setName(playerBName);
    }
    
}
