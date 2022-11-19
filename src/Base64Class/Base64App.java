/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base64Class;
import java.util.Base64;
/**
 *
 * @author GIE
 */
public class Base64App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String original = "Egi Purnama Mauludin";
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);
        
        byte[] bytes= Base64.getDecoder().decode(encoded);
        String result = new String(bytes);
        System.out.println(result);
    }
    
}
