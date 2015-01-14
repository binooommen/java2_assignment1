/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author c0572709
 */
public class Assignment1Test {
    
    public Assignment1Test() {
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
     * Test of main method, of class Assignment1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Assignment1.main(args);
    }

    /**
     * Test of processOrder method, of class Assignment1.
     */
    @Test
    public void testProcessOrder() {
        System.out.println("processOrder");
        Order o = new Order(1, "Steve");
        Assignment1 instance = new Assignment1();
        instance.processOrder(o);
        
        Date expResult = new Date();
        Date result = o.getTimeReceived();
        
        assertEquals(expResult, result);
        
        System.out.println("Expected Result: " + expResult);
        System.out.println("Actual Result: " + o.getTimeReceived());
    }
    
}
