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
public class BoardView {
    
  
    
    public static void main(String[] args) {
         int board[] = {1, 2, 3, 4, 5};
         int val;
         boolean found = false;

         Scanner input = new Scanner(System.in);
         System.out.println("Enter a number to see if it's in the array.");
         val = input.nextInt();
         
         for (int x : board) {
             if (x == val) {
                 found = true;
        }
    }
         if (found) {
             System.out.println(val + " is found in the array");
         }
         else {
             System.out.println("Sorry. " + val + " is not found in the array.");
         }
        
    
      }
          }
