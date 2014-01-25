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
public class GameMenu {
    String newGameBtn = "New Game"; //new game button
    String preferencesBtn = "Preferences"; //preferences button
    String statisticsBtn = "Statistics"; //statistics button
    String helpMenuBtn = "Help"; //help menu button
    String quitBtn = "Quit"; //quit button

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameMenu screen1 = new GameMenu();
        screen1.displayList1();
    }
        public void displayList1() {
        System.out.println(this.newGameBtn);
        System.out.println(this.preferencesBtn);
        System.out.println(this.statisticsBtn);
        System.out.println(helpMenuBtn);
        System.out.println(quitBtn);
    }
    
}

