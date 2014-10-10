 /**
  * Universidad del Valle de Guatemala
  * Integrantes:
  * Luis Carlos Ralón
  * Erick Hernández
  * Johnny del Cid
  * prueba unitaria para el simple set
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell Latitude
 */
public class SimpleSetTest {

    /**
     * Test of get method, of class SimpleSet.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = null;
        SimpleSet instance = new SimpleSet();
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class SimpleSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = null;
        SimpleSet instance = new SimpleSet();
        instance.add(wordObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
