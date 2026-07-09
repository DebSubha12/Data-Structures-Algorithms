<<<<<<< HEAD
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

public class RangeSumBSTCalculator {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        // If current node value is smaller than low,
        // only search in the right subtree.
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }

        // If current node value is greater than high,
        // only search in the left subtree.
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }

        // Current node is within range.
        return root.val
                + rangeSumBST(root.left, low, high)
                + rangeSumBST(root.right, low, high);
    }

    public static void main(String[] args) {
        /*
                 10
                /  \
               5    15
              / \     \
             3   7     18

            Range: [7, 15]
            Sum = 7 + 10 + 15 = 32
        */

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.right = new TreeNode(18);

        int low = 7;
        int high = 15;

        RangeSumBSTCalculator calculator = new RangeSumBSTCalculator();
        int result = calculator.rangeSumBST(root, low, high);

        System.out.println("Range Sum BST = " + result);
    }
=======
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

public class RangeSumBSTCalculator {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        // If current node value is smaller than low,
        // only search in the right subtree.
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }

        // If current node value is greater than high,
        // only search in the left subtree.
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }

        // Current node is within range.
        return root.val
                + rangeSumBST(root.left, low, high)
                + rangeSumBST(root.right, low, high);
    }

    public static void main(String[] args) {
        /*
                 10
                /  \
               5    15
              / \     \
             3   7     18

            Range: [7, 15]
            Sum = 7 + 10 + 15 = 32
        */

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.right = new TreeNode(18);

        int low = 7;
        int high = 15;

        RangeSumBSTCalculator calculator = new RangeSumBSTCalculator();
        int result = calculator.rangeSumBST(root, low, high);

        System.out.println("Range Sum BST = " + result);
    }
>>>>>>> 775d387 (Save All Changes)
}