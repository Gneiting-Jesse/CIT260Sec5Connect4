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
public class SummationOfArrays {
    
    public static void main(String[] args) {
        SummationOfArrays summationOfArrays = new SummationOfArrays();
        summationOfArrays.summationArray1();
        summationOfArrays.summationArray2();
    }
    public static void summationArray1() {
        double[] nums = {151.2, 43.3, 12.8};
        double sum = 0;
        for (double x : nums) {
             sum += x;
}
        System.out.println("The summation of the first array is "+sum+"\n");
    }
    public static void summationArray2() {
        int[] nums = {54,96,78,25,41,789};
        int sum = 0;
        for (int x : nums) {
             sum += x;
}
        System.out.println("The summation of the second array is "+sum);
    }
    
}
