
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class DiameterofBinaryTree {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Update diameter
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height of subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DiameterofBinaryTree tree = new DiameterofBinaryTree();

        int result = tree.diameterOfBinaryTree(root);

        System.out.println("Diameter of Binary Tree: " + result);
    }
}