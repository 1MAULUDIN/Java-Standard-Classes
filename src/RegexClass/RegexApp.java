/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegexClass;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author GIE
 */
public class RegexApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Egi Purnama Mauludin";
        Pattern pattern = Pattern.compile("[a-zA-z]*[a]*[a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);
        
        while(matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }
    }
    
}
