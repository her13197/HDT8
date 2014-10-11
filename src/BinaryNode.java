 /**
  * Universidad del Valle de Guatemala
  * Integrantes:
  * Luis Carlos Ralón
  * Erick Hernández
  * Johnny del Cid
  * Codigo obtenido de:
  *  Implements a top-down splay tree.
 * Available at http://www.link.cs.cmu.edu/splay/
 * Author: Danny Sleator <sleator@cs.cmu.edu>
 * This code is in the public domain.
 */

class BinaryNode
{
    BinaryNode(Comparable theKey) {
        key = theKey;
        left = right = null;
    }   

    Comparable key;          // The data in the node
    BinaryNode left;         // Left child
    BinaryNode right;        // Right child
    
}
