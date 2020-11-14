
package math.util;

import static huynhntp.util.MathUtility.*;

// Khai bao san ham static goi ham static khong can cham nua


public class MathUtil {

    
    public static void main(String[] args) {
        
        long expected = 120;
        long actual = getFactorial(5);
        System.out.println("Expected: " + expected + " actial: "+ actual);
        
        
        // Expected 6! = 720
        System.out.println("6! = " +getFactorial(6));
        
        // Expected : 1 if tinh 0!
        System.out.println("0! = " + getFactorial(0));
        
        // Expected : IlligalArgumentException if tinh -5!
       
//        System.out.println("-5!: = " + MathUtility.getFactorial(-5));
        
        // in PI coi co giong Math.PI hem
        System.out.println("PI: " +PI);
    }
    
}
