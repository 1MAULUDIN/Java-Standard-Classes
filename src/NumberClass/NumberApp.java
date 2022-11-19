/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberClass;

/**
 *
 * @author GIE
 */
public class NumberApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();
        
        String contoh = "10000";
        Integer contohINT = Integer.valueOf(contoh);
        System.out.println(contoh);
        int a = (int) contohINT;
        System.out.println(a);
    }
    
}
