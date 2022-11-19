/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PropertiesClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author GIE
 */
public class PropertiesApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("Application.properties"));
            
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");
            
            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
            
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ketemu");
        } catch (IOException e) {
            System.out.println("Gagal load data dari file");
        }
        
        try {
        Properties properties = new Properties();
        properties.put("name.first","Egi");
        properties.put("name.middle","Purnama");
        properties.put("name.last", "Mauludin");
        
        properties.store(new FileOutputStream("name.properties"),"Konfigurasi Nama");
        } catch (FileNotFoundException exception) {
            System.out.println("Error membuat file properties");
        } catch (IOException exception) {
            System.out.println("Error menyimpan properties");
        }
    }
    
}
