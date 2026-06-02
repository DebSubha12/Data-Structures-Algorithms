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

public class SameNode {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // One node is null
        if (p == null || q == null) {
            return false;
        }

        // Values are different
        if (p.val != q.val) {
            return false;
        }

        // Compare left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        SameNode sol = new SameNode();

        // First Tree
        TreeNode tree1 = new TreeNode(
            1,
            new TreeNode(2),
            new TreeNode(3)
        );

        // Second Tree
        TreeNode tree2 = new TreeNode(
            1,
            new TreeNode(2),
            new TreeNode(3)
        );

        // Check if trees are same
        boolean result = sol.isSameTree(tree1, tree2);

        System.out.println("Are both trees identical? " + result);
    }
}
