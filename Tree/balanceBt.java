package Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class balanceBt {

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = height(root.left);
        if (l == -1) return -1;

        int r = height(root.right);
        if (r == -1) return -1;

        if (Math.abs(l - r) > 1) {
            return -1;
        }

        return 1 + Math.max(l, r);
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public static void main(String[] args) {

        balanceBt sol = new balanceBt();

        /*
                 1
                / \
               2   3
              / \
             4   5

           Balanced Tree
        */

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        System.out.println("Tree 1 Balanced: " + sol.isBalanced(root1));

        /*
                 1
                /
               2
              /
             3
            /
           4

           Unbalanced Tree
        */

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);

        System.out.println("Tree 2 Balanced: " + sol.isBalanced(root2));
    }
}