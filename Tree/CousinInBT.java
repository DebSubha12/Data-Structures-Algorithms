package Tree;

import java.util.*;

// Binary Tree Node
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

public class CousinInBT {

    // Check whether x and y have same parent
    static boolean parent(TreeNode root, int x, int y) {

        if (root == null) {
            return false;
        }

        if (root.left != null && root.right != null) {

            if (root.left.val == x && root.right.val == y) {
                return true;
            }

            if (root.left.val == y && root.right.val == x) {
                return true;
            }
        }

        return parent(root.left, x, y) ||
               parent(root.right, x, y);
    }

    // Function to check cousins
    static boolean isCousins(TreeNode root, int x, int y) {

        if (root == null) {
            return false;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int l1 = -1, l2 = -1;
        int level = 0;

        while (!q.isEmpty()) {

            int n = q.size();

            while (n-- > 0) {

                TreeNode temp = q.poll();

                if (temp.val == x) {
                    l1 = level;
                }

                if (temp.val == y) {
                    l2 = level;
                }

                if (temp.left != null) {
                    q.offer(temp.left);
                }

                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }

            // If only one node found at this level
            if ((l1 != -1 && l2 == -1) ||
                (l1 == -1 && l2 != -1)) {
                return false;
            }

            // Both found
            if (l1 != -1 && l2 != -1) {
                break;
            }

            level++;
        }

        // Cousins => same level but different parents
        return !parent(root, x, y);
    }

    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
               \     \
                4     5

            4 and 5 are cousins
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        int x = 4;
        int y = 5;

        boolean ans = isCousins(root, x, y);

        if (ans) {
            System.out.println(x + " and " + y + " are cousins.");
        } else {
            System.out.println(x + " and " + y + " are NOT cousins.");
        }
    }
}