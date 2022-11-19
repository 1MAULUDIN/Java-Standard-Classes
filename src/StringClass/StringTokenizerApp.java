/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringClass;
import java.util.StringTokenizer;
/**
 *
 * @author GIE
 */
public class StringTokenizerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Egi Purnama Mauludin";
        StringTokenizer tokenizer = new StringTokenizer(name,",");
        
        while(tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
    
}
