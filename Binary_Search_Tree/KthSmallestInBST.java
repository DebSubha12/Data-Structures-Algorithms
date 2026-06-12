package Binary_Search_Tree;

import java.util.Scanner;

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

class KthSmallestFinder {
    private int count = 0;
    private int answer = 0;

    public int findKthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return answer;
    }

    private void inorderTraversal(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left, k);

        count++;
        if (count == k) {
            answer = node.val;
            return;
        }

        inorderTraversal(node.right, k);
    }
}

public class KthSmallestInBST {

    public static void main(String[] args) {

        /*
                 5
               /   \
              3     6
             / \
            2   4
           /
          1

        Inorder Traversal: 1, 2, 3, 4, 5, 6
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Target :");
        int k = sc.nextInt();

        KthSmallestFinder finder = new KthSmallestFinder();
        int result = finder.findKthSmallest(root, k);

        System.out.println("The " + k + "smallest element in the BST is: " + result);
    }
}