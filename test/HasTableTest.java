 /**
  * Universidad del Valle de Guatemala
  * Integrantes:
  * Luis Carlos Ralón
  * Erick Hernández
  * Johnny del Cid
  * prueba unitaria para el Hashtale
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell Latitude
 */
public class HasTableTest {
    
    public HasTableTest() {
    }

    /**
     * Test of add method, of class HasTable.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = null;
        HasTable instance = new HasTable();
        instance.add(wordObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HasTable.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = null;
        HasTable instance = new HasTable();
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
