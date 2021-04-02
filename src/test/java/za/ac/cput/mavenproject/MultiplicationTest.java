/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Lenovo
 * 216250811
 */
public class MultiplicationTest {
    
   
        private Multiplication number1;
    private Multiplication number2;
    
    public static void multiplicationTest() {
        
    }
     @Test
    public void objectEquality() {
                assertEquals(number1, number2);
    }
    
    @Test
    public void objectIdentity() {
        assertNotSame(number1, number2);
    }
    
    
 
    
    @Test
    public void failedTest() {
          fail("Fail test");
        System.out.println("Fail");
    }
    
    @Test
    public void timeoutTest() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Timeout");
    }
    
    @Disabled("Do not run in lower environment")
    @Test
    public void disablingTest() {
         System.setProperty("number1", "number2");
        Assumptions.assumeFalse("number1".equals(System.getProperty("number2")));
    }

    
}
