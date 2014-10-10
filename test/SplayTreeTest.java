 /**
  * Universidad del Valle de Guatemala
  * Integrantes:
  * Luis Carlos Ralón
  * Erick Hernández
  * Johnny del Cid
  * prueba unitaria para el splay tree
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell Latitude
 */
public class SplayTreeTest {
    
    /**
     * Test of add method, of class SplayTree.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word word = null;
        SplayTree instance = new SplayTree();
        instance.add(word);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class SplayTree.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = null;
        SplayTree instance = new SplayTree();
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


}
