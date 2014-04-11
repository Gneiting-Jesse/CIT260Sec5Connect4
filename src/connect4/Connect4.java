/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

/**
 *
 * @author Jesse Gneiting and Marcy Jagielski
 */
import byui.cit260.connect4.enums.ErrorType;
import byui.cit260.connect4.frames.MainFrame;
import byui.cit260.connect4.models.Player;
import java.io.Serializable;
import java.util.Scanner;

public class Connect4 implements Serializable {
    public static MainFrame mainFrame = null;

    public static Scanner getInputFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     *
     */
    
    private Player[] players = new Player[10];

    public Connect4() {
        
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
   
    public static void main(String[] args) {
        Connect4 connect4 = null;

        try {
            connect4 = new Connect4();
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                Connect4.mainFrame = new MainFrame();
                Connect4.mainFrame.setVisible(true);
            }
        });
        }
        catch (Throwable ex) {
            ErrorType.displayErorrMsg("Unexpected error: " + ex.getMessage());
            ErrorType.displayErorrMsg(ex.getStackTrace().toString());
        }
        finally {
            if (Connect4.mainFrame != null) {
                Connect4.mainFrame.dispose();
            }
        }
    }
    }
    
      
