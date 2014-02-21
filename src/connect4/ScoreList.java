/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

/**
 *
 * @author Jesse
 */
public class ScoreList {
    static String scoreList[] = {"Zack won 5 games","Anndee won 2 games","Robby won 3 games","George won 1 game","Mallory won 2 games"};
    String temp;
    static int shortestStringIndex;
    
    public static void main(String[]args) {
        for(int j=0; j < scoreList.length - 1; j++) {
            shortestStringIndex = j;
            for(int i = j + 1; i < scoreList.length; i++) {
                if(scoreList[i].trim().compareToIgnoreCase(scoreList[shortestStringIndex].trim())<0) {
                    shortestStringIndex = i;
                }
            }
            if(shortestStringIndex != j)
            {
                String temp = scoreList[j];
                scoreList[j] = scoreList[shortestStringIndex];
                scoreList[shortestStringIndex] = temp;
            }
        }
        for(int k = 0; k < scoreList.length; k++)
            System.out.println(scoreList[k]);
    }
}
