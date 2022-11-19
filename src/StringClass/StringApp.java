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
public class StringApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Egi Purnama Mauludin";
        
        
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.startsWith("E"));
        System.out.println(name.endsWith("n"+"\n"));
        
        String[] names = name.split(" ");
        for(var value : names) {
            System.out.println(value);
        }
        
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println(name.charAt(0)+"\n");
        
        char[] chars = name.toCharArray();
        for(var i : chars) {
            System.out.println(i);
        }
        System.out.println();
        
        for(int i = 0; i <= chars.length; i++) {
            for(int j = 0; j <= i-1; j++) {
                System.out.print(chars[j]);
            }
            System.out.println("");
        }
    }
    
}
