/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

/**
 *
 * @author marcy
 */
public class HelpMenuControl  {
    
    public HelpMenuControl() {
        
    } 

    public void displayGameHelp() {
         
        System.out.println("\tThe objective of the game is to be the first\n"
                + "\tplayer to place 4 of circular discs conecutively in a\n"
                + "\tline either vertically, horizontally or diagonally.\n\n"
                + "\tGood Luck!\n\n");
                

    }
      
    public void display1PlayerHelp() {
   
        System.out.println("\tIn a 1 Player Game you will be competing against\n"
                + "\tthe computer. It will be a battle of Man vs Machine.\n\n"); 

    }
            
    public void display2PlayerHelp() {
    
        System.out.println("\tIn a 2 Player Game you will have the opportunity to\n"
                + "\tcompete against your friend, family, or even enemy to find out\n"
                + "\twhich on of you is the best gamer.\n\n"); 
    }
    
                   
}
