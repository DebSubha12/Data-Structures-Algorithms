package Tree;

import java.util.*;

/**
 * Definition for a binary tree node.
 */
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

public class levelorderTraversalSpiral {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> s1 = new Stack<>(); // Right to Left
        Stack<TreeNode> s2 = new Stack<>(); // Left to Right

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            List<Integer> level = new ArrayList<>();

            if (!s1.isEmpty()) {

                while (!s1.isEmpty()) {

                    TreeNode temp = s1.pop();

                    level.add(temp.val);

                    if (temp.left != null) {
                        s2.push(temp.left);
                    }

                    if (temp.right != null) {
                        s2.push(temp.right);
                    }
                }

            } else {

                while (!s2.isEmpty()) {

                    TreeNode temp = s2.pop();

                    level.add(temp.val);

                    if (temp.right != null) {
                        s1.push(temp.right);
                    }

                    if (temp.left != null) {
                        s1.push(temp.left);
                    }
                }
            }

            result.add(level);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        levelorderTraversalSpiral sol = new levelorderTraversalSpiral();

        List<List<Integer>> result = sol.zigzagLevelOrder(root);

        System.out.println("Zigzag Level Order Traversal:");

        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}