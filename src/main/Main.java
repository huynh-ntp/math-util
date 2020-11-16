
package main;

import static huynhntp.util.MathUtility.*;

// Khai bao san ham static goi ham static khong can cham nua


public class Main {

    
    public static void main(String[] args) {
        
        long expected = 120;
        long actual = getFactorial(5);
        System.out.println("Expected: " + expected + " actial: "+ actual);
        
        
        // Expected 6! = 720
        System.out.println("6! = " +getFactorial(6));
        
        // Expected : 1 if tinh 0!
        System.out.println("0! = " + getFactorial(0));
        
        // Expected : IlligalArgumentException if tinh -5!
       
        System.out.println("-5!: = " + getFactorial(-5));
        
        // in PI coi co giong Math.PI hem
        System.out.println("PI: " +PI);
    }
    
}

// Muốn kết luận hàm mình ngon ta phải nhìn bằng mắt kết quả chạy của hàm và so sánh với kì vọng
// làm từng trường hợp chạy hàm - test case
// cách này ổn nhưng mất sức
// cách nâng ca0: dùng màu sắc xanh và đỏ để kết luận
// NẾU TA THẤY XANH THÌ SUCCESSFULL
// CHỈ MỘT THẰNG ĐỎ THÌ FAILED
// TA SÀI FRAMEWORK, UNIT TEST TÊN CHUNG
// JUNIT, TESTING , NUNIT,    LÀ NHỮNG FRAMEWORK CỤ THỂ ĐỂ GIÚP TEST CÁC HÀM MỘT CÁCH HIỆU QUẢ
// DÙNG NÓ TA TÍCH HỢP VÀO MỘT QUY TRINH FPHAANF MỀM LỚN HƠN///  CI-CT-CD-DEVOPS