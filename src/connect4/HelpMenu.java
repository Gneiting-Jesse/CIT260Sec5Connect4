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
public class HelpMenu {
    String objectiveBtn = "Game Objective"; //game objective button
    String onePlyrBtn = "1 Player Game"; //1 player game button
    String twoPlyrBtn = "2 Player Game"; //2 player game button
    String returnBtn = "Return to Game"; //return to game button

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelpMenu screen2 = new HelpMenu();
        screen2.displayList2();
        // TODO code application logic here
    }
    public void displayList2() {
        System.out.println(objectiveBtn);
        System.out.println(onePlyrBtn);
        System.out.println(twoPlyrBtn);
        System.out.println(returnBtn);
    }
    
}
