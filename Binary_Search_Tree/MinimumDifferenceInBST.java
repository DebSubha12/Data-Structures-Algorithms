package Binary_Search_Tree;

public class MinimumDifferenceInBST {

    static class TreeNode {
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

    static class Solution {
        private Integer prev = null;
        private int ans = Integer.MAX_VALUE;

        private void minDist(TreeNode root) {
            if (root == null) {
                return;
            }

            minDist(root.left);

            if (prev != null) {
                ans = Math.min(ans, root.val - prev);
            }

            prev = root.val;

            minDist(root.right);
        }

        public int minDiffInBST(TreeNode root) {
            minDist(root);
            return ans;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution solution = new Solution();
        System.out.println("Minimum Difference in BST: "
                + solution.minDiffInBST(root));
    }
}