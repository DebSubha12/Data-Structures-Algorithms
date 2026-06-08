package Binary_Search_Tree;
// public class  Node {

import java.util.Scanner;

//     int data;
//     Node left;
//     Node right;
//     public Node (int value){
//         this.data=value;
//         left=right=null;
//     }

// }
public class CreateBST {
    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int value) {
            this.data = value;
            left = right = null;
        }

    }

    Node insert(Node root, int target) {
        // base case
        if (root == null) {
            Node temp = new Node(target);
            return temp;
        }
        if (target < root.data) {
            root.left = insert(root.left, target);
        } else {
            root.right = insert(root.right, target);
        }
        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    static boolean search(Node root, int target) {
        if (root == null)
            return false;
        if (root.data == target) {
            return true;
        }
        if (root.data > target) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }
    }

    public static void main(String[] args) {
        CreateBST obj = new CreateBST();
        int arr[] = { 3, 7, 4, 1, 6, 8 };
        int n = arr.length;
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = obj.insert(root, arr[i]);
        }
        inorder(root);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target element: ");
        int target = sc.nextInt();


        if (search(root, 4)) {
            System.out.println("Element Present");
        } else {
            System.out.println("Element Not Present");
        }
    }
}
