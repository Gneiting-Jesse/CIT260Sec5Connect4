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
import byui.cit260.connect4.exceptions.Connect4Exception;
import byui.cit260.connect4.exceptions.MenuException;
import byui.cit260.connect4.frames.MainFrame;
import byui.cit260.connect4.menuviews.MainMenuView;
import java.io.Serializable;
import java.util.Scanner;

public class Connect4 implements Serializable {
    private static final Scanner inFile = new Scanner(System.in);
    // Instance variables
    private String instructions = "\t\t\t Welcome to Connect4!\n\n"
            + "\tYou will have the option of choosing a 1 player game or\n"
            + "\ta 2 player game. Each player will have a different game\n"
            + "\tpiece. The object of the game is to place 4 of your game\n"
            + "\tpieces consecutively in a line either vertically,\n"
            + "\thorizontally or diagonally.\n\n"
            + "\tGood Luck!\n\n";

    public Connect4() {
    }

    public static Scanner getInputFile() {
        return inFile;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
        
    public static void main(String[] args) throws Connect4Exception {
        Connect4 myGame = new Connect4();
        try {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Connect4.mainFrame = new MainFrame();
                Connect4.mainFrame.setVisible(true);
            }
        });
        }
        catch (throwable ex) {
            ErrorType.displayErorrMsg("Unexpected error: " + ex.getMessage());
            ErrorType.displayErorrMsg(ex.getStackTrace().toString());
        }
        finally {
            if (Connect4.mainFrame != null) {
                Connect4.mainFrame.dispose();
            }
        }
       myGame.displayWelcome();
        MainMenuView mainMenu = new MainMenuView() {
            

            @Override
            public void getInput() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
         try {
            mainMenu.executeCommands(null);
        } catch (Exception ex) {
           System.out.println(ex.getMessage());
        }
        finally {
            Connect4.inFile.close();
        }
    }

    private void displayWelcome () {
        System.out.println(this.instructions);}
        
}
