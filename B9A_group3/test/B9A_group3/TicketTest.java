

package B9A_group3;

import b9a_group3.Ticket;
import b9a_group3.Fishing;
import b9a_group3.Customer;
import b9a_group3.Sailing;
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
public class TicketTest {
    
    public TicketTest() {
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
     * Test of setBooking method, of class Ticket.
     */
    @Test
    public void testSetFishing() {
        System.out.println("setBooking");
        Fishing fishing = new Fishing ("9","10/2",4);
        Customer customer = new Customer ("Kofa","0532098887",21);
        Ticket instance = new Ticket (customer,fishing);
        assertNotNull(instance.getFishing());
       
        
    }

    @Test
    public void testSetSailing() {
        System.out.println("setBooking");
        Sailing sailing = new Sailing (5,"9","10/2",4);
        Customer customer = new Customer ("Kofa","0532098887",21);
        Ticket instance = new Ticket (customer,sailing);
        assertNotNull(instance.getSailing());
       
        
    }
    
    
    
}
