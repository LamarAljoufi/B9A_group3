/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B9A_group3;

import b9a_group3.Service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kefayaaltaezi
 */
public class ServiceTest {
    
    public ServiceTest() {
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

   
    @Test
    public void testCheckUpgradeTicketTrue() {
        System.out.println("checkUpgradeTicket");
        int upgrade = 2;
        Service instance = new Service ("8","3/10",2);
      
        boolean result = instance.checkUpgradeTicket(upgrade);
        assertTrue( result);
       
        
    }
      @Test
    public void testCheckUpgradeTicketFalse() {
        System.out.println("checkUpgradeTicket");
        int upgrade = 4;
        Service instance = new Service ("8","3/10",2);
       
        boolean result = instance.checkUpgradeTicket(upgrade);
        assertFalse( result);
       
        
    }
}
