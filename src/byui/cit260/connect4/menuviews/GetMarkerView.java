/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.menuviews;

import byui.cit260.connect4.models.Game;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class GetMarkerView {
    
    public static void mainMeth(String[] args) {
       GetMarkerView getMarker = new GetMarkerView();
       getMarker.getInput();
    }

    public GetMarkerView(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GetMarkerView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getInput() {

        String newMarker = null;
        Scanner in = new Scanner(System.in);
                
        boolean valid = false; 
        while (!valid) {
            
            System.out.println("\n\tEnter a single character that will be "
                    + "used to mark your squares in the game.");
                            
            newMarker = in.nextLine();
           
            if (newMarker == null  || newMarker.length() > 1) {
                System.out.println ("\n\tInvalid number of characters or entry");
                continue;
            }
            
            valid = true;
        }
        
        return newMarker;
    }
    
}