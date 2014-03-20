/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menuviews;

import connect4.Connect4;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class GetMarkerView implements Serializable{
    
    public static void mainMeth() {
       GetMarkerView getMarker = new GetMarkerView();
       getMarker.getInput();
    }

    public GetMarkerView() {
    }
    
    public String getInput() {

        String newMarker = null;
        Scanner inFile = Connect4.getInputFile();
                
        boolean valid = false; 
        while (!valid) {
            
            System.out.println("\n\tEnter a single character that will be "
                    + "used to mark your squares in the game.");
                            
            newMarker = inFile.nextLine();
           
            if (newMarker == null  || newMarker.length() > 1) {
                System.out.println ("\n\tInvalid number of characters or entry");
                continue;
            }
            
            valid = true;
        }
        
        return newMarker;
    }
    
}

