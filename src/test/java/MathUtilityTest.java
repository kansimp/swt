/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.khoa.birdcage.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Khoa
 */
public class MathUtilityTest {
    
    // Test case #1 : verify getFactorial(with n = 0)
    //Steps/Procedures"
    //      1.Given n=0
    //      2.Call/invoke getFactorial(n=0)
    //Expected result:
    //      The method must return 1 as the result of 0!=1
    //Status : PASSED | FAILED chờ lycs chạy hàm mới biết trạng thái đúng sai
    @Test 
    public void verifyFactorialGivenRighArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
        
    }
      @Test 
    public void verifyFactorialGivenRighArgument1ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1));
        
    }
     
      @Test 
    public void verifyFactorialGivenRighArgument5ReturnsOk(){
        assertEquals(120, MathUtility.getFactorial(5));
        
    }
     
     
}
