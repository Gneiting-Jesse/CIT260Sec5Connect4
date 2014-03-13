/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author marcy
 */
public abstract class Menu {
    private String [][] menuItems = null;

    public Menu() {
    }
    
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    
    public abstract String executeCommands(Object object);
    
    public String[][] getMenuItems() {
        return menuItems;
    }
    
    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
    public final void display() {
        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tEnter the character associated with one of the following options:");
        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
    }
    
    private boolean validCommand(String command) {
        String[][] items = this.menuItems;
        
        for (String[] item : this.menuItems) {
            if (item[0].equals(command)){
                return true;
            }
        }
        return false;
    }
    
   public abstract void getInput();
}
