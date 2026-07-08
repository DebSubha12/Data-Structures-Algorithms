import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BSTOperations {

    Node root;

    // Insert a node into BST
    Node insert(Node root, int target) {
        if (root == null) {
            return new Node(target);
        }

        if (target < root.data) {
            root.left = insert(root.left, target);
        } else if (target > root.data) {
            root.right = insert(root.right, target);
        }

        return root;
    }
    int countNodes(Node root) {
        if (root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    int findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTOperations bst = new BSTOperations();

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter values:" + n);

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            bst.root = bst.insert(bst.root, value);
        }
         System.out.println("\nTotal Number of Nodes = " + bst.countNodes(bst.root));
        System.out.println("Minimum Value = " + bst.findMin(bst.root));
        System.out.println("Maximum Value = " + bst.findMax(bst.root));

        sc.close();
    }
}