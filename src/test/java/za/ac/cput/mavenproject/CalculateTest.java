/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CalculateTest {
    
    public CalculateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of square method, of class Calculate.
     */
    @Test
    public void testEquality() {
        System.out.println("square");
        int x = 5;
        Calculate instance = new Calculate();
        int expResult = 25;
        int result = instance.square(x);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testIdentity() {
        System.out.println("square");
        int x = 5;
        Calculate instance = new Calculate();
        int expResult = 25;
        int result = instance.square(x);
        assertEquals(expResult, result);
    }
    @Test
    public void testFailing() {
        System.out.println("square");
        int x = 5;
        Calculate instance = new Calculate();
        int expResult = 25;
       
        int result = instance.square(x);
        assertEquals(expResult, result);
        fail("This test will fail");}
  
 @Test
    public void testTimeout() {
        System.out.println("square");
        int x = 5;
        Calculate instance = new Calculate();
        int expResult = 25;
        int timeout=40;
        int result = instance.square(x);
        assertEquals(expResult, result);
    while(true);} 
}


