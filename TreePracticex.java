package Process;



public class TreePracticex {
    static class Node
    {
        int data;
        Node left;
        Node right;
    };

    // Helper function that allocates a new node
// with the given data and null left
// and right pointers.
    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;

        return(node);
    }

    // Function to check if two trees
// have same structure
    static boolean isSymmetric(Node a) {
        if (a == null) {
            return true;
        }
        return isHelper(a.left, a.right);
    }

    private static boolean isHelper(Node root1, Node root2) {
        if(root1==null && root2==null){
            return true;
        }
        if(root1!=null && root2!=null){
            return root1.data==root2.data && isHelper(root1.left,root2.right) && isHelper(root1.right,root2.left);
        }
        return false;
    }
    // Driver code
    public static void main(String args[])
    {
        Node root1 = newNode(1);
  //      Node root2 = newNode(1);
        root1.left = newNode(2);
        root1.right = newNode(2);
        root1.left.left = newNode(3);
        root1.left.right = newNode(4);
        root1.right.right = newNode(3);
        root1.right.left = newNode(4);

 //       root2.left = newNode(2);
 //       root2.right = newNode(3);
//        root2.left.left = newNode(40);
//        root2.left.right = newNode(90);
//        root2.right.right = newNode(4);

        if (isSymmetric(root1))
            System.out.printf("Both trees have same structure");
        else
            System.out.printf("Trees do not have same structure");
    }
}


