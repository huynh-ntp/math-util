
package math.util;

import huynhntp.util.MathUtility;


public class MathUtil {

    
    public static void main(String[] args) {
        
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        System.out.println("Expected: " + expected + " actial: "+ actual);
        
        
        // Expected 6! = 720
        System.out.println("6! = " + MathUtility.getFactorial(6));
        
        // Expected : 1 if tinh 0!
        System.out.println("0! = " + MathUtility.getFactorial(0));
        
        // Expected : IlligalArgumentException if tinh -5!
        
        System.out.println("-5!: = " + MathUtility.getFactorial(-5));
        
        
    }
    
}
