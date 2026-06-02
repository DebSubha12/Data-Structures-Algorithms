package Tree;


//Size and count BT
  class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class AllOperationBinaryTree {
    //Size Of Binary Tree
    int totalNode(Node root){
        if(root==null){
            return 0;
        }
        return(1+totalNode(root.left)+totalNode(root.right));
    }
    //Count Leaves In Binary Tree
    int countLeaves(Node node) {

        // Base case
        if (node == null) {
            return 0;
        }

        // If leaf node
        if (node.left == null && node.right == null) {
            return 1;
        }

        // Count leaves in left and right subtree
        return countLeaves(node.left) + countLeaves(node.right);
    }

    //Count Non Leaf
    int nonleaf(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        return (1+nonleaf(root.left)+nonleaf(root.right));
    }

    // Driver code
    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \     \
            4   5     6
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        AllOperationBinaryTree obj = new AllOperationBinaryTree();

        System.out.println("Leaf Nodes Count: " + obj.countLeaves(root));
        System.out.println("Size Of Binary Tree: "+ obj.totalNode(root));
        System.out.println("Non Leaf Nodes :"+obj.nonleaf(root));
    }
}
