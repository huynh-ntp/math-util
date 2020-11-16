/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynhntp.uti.test;

import static huynhntp.util.MathUtility.*;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {
    
    @Test //@Test sẽ biến hàm này thành public static void main()
    // cách đặt tên hàm sẽ nói lên mục tiêu test hàm. Có nhiều quy tắc đặt tên 
    //hàm test
    public void getFactorial_RunWell_IfValidArgument(){
        assertEquals(120,getFactorial(5));
    }
    
    //cần test xem có ném về ngoại lệ hay không
    // nếu ném IllegalArgumentException trong tình huống -5 
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        getFactorial(-5);
        // Ngoại lệ không phải là một value đem ra so sánh. Chỉ có thể đem ra kiểm tra
        // coi nó có xuất hiện hay không
    }
}
