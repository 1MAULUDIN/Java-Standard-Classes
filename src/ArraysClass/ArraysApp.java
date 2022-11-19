/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysClass;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author GIE
 */
public class ArraysApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] value = {2,3,6,7,4,1,9,8,10,5};
        
        Arrays.sort(value);
        System.out.println(Arrays.toString(value));
       
        System.out.println( Arrays.binarySearch(value, 9));
    }
    
}
