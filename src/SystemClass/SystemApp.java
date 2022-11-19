/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemClass;

/**
 *
 * @author GIE
 */
public class SystemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.getenv("HOME"));
        System.exit(0);
        
    }

}
