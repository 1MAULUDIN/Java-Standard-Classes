/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateNCalenderClass;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author GIE
 */
public class DateApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);
        
        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.YEAR,2000);
        calender.set(Calendar.MONTH,0);
        calender.set(Calendar.HOUR_OF_DAY,10);
        
        Date result = calender.getTime();
        System.out.println(result);
    }
    
}
