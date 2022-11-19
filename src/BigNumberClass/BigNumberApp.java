/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigNumberClass;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author GIE
 */
public class BigNumberApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger value = new BigInteger("10000000000000000000");
        BigInteger value1 = new BigInteger("10000000000000000000");
        BigInteger value2 = value.add(value1);
        System.out.println(value2);
        
        BigDecimal a = new BigDecimal("1.240000000000000000000000000000");
        BigDecimal b = new BigDecimal("1.240000000000000000000000000000");
        BigDecimal c = a.add(b);
        System.out.println(c);
    }
    
}
