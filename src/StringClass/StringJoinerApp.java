/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringClass;
import java.util.StringJoiner;
/**
 *
 * @author GIE
 */
public class StringJoinerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(" ","[","]");
        joiner.add("Egi");
        joiner.add("Purnama");
        joiner.add("Mauludin");
        
        String value = joiner.toString();
        System.out.println(value);
    }
    
}
