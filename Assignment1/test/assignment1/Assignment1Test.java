/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0647015
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newOrderArrives method, of class Assignment1.
     */
    @Test
    public void testNewOrderArrives() throws Exception {
        System.out.println("newOrderArrives");
        Order order = null;
        Assignment1 instance = new Assignment1();
        instance.newOrderArrives(order);
        
        Order order1 = new Order(1, "Jack");

        fail("The test case is a prototype.");
    }
    
}
