/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomClass;
import java.util.Random;
/**
 *
 * @author GIE
 */
public class RandomApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i <1000; i++) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }
    }
    
}
