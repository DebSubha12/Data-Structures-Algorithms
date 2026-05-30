package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateBinaryTree {
    // Create Node
    public static class Node {
        int data;
        Node left, right;

        public Node(int value) {
            this.data = value;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Root Element:");
        int x = sc.nextInt();
        int first, second;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(x);
        q.add(root);
        // Build The binary tree
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.poll();
            System.out.print("Enter The left value of " + temp.data);
            first = sc.nextInt();// left node value
            if (first != -1) {

                temp.left = new Node(first);
                q.add(temp.left);
            }
            // Right Node
            System.out.print("Enter The right value of " + temp.data);
            second = sc.nextInt();
            if (second != -1) {

                temp.right = new Node(second);
                q.add(temp.right);
            }
        }
    }
}
