   /**
  * Universidad del Valle de Guatemala
  * Integrantes:
  * Luis Carlos Ralón
  * Erick Hernández
  * Johnny del Cid
  * Codigo obtenido de:
  * http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/
  * Implements a red-black tree.
     * Note that all "matching" is based on the compareTo method.
     * @author Mark Allen Weiss
 */
    // Basic node stored in red-black trees
    // Note that this class is not accessible outside
    // of package DataStructures

    class RedBlackNode
    {
            // Constructors
        RedBlackNode( Comparable theElement )
        {
            this( theElement, null, null );
        }

        RedBlackNode( Comparable theElement, RedBlackNode lt, RedBlackNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
            color    = RedBlackTree.BLACK;
        }

            // Friendly data; accessible by other package routines
        Comparable   element;    // The data in the node
        RedBlackNode left;       // Left child
        RedBlackNode right;      // Right child
        int          color;      // Color
    }