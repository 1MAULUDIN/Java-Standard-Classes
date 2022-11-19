/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringClass;

/**
 *
 * @author GIE
 */
public class StringBuilderApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Egi ");
        builder.append("Purnama ");
        builder.append("Mauludin");
        
        String myName = builder.toString();
        System.out.println(myName);
    }
    
}
