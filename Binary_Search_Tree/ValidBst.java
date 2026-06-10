package Binary_Search_Tree;

import java.util.ArrayList;

public class ValidBst {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int value) {
            this.data = value;
            left = right = null;
        }
    }

    void inorder(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }

        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }

    public boolean isValidBST(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        inorder(root, ans);

        for (int i = 1; i < ans.size(); i++) {
            if (ans.get(i) <= ans.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Constructing the BST:
        //         5
        //        / \
        //       3   7
        //      / \ / \
        //     2  4 6  8

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.left = new Node(6);
        root.right.right = new Node(8);

        ValidBst obj = new ValidBst();

        if (obj.isValidBST(root)) {
            System.out.println("The tree is a valid BST.");
        } else {
            System.out.println("The tree is NOT a valid BST.");
        }
    }
}