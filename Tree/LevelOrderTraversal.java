

import java.util.*;

// Main Class
public class LevelOrderTraversal {

    // Tree Node
    static class Node {

        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Function for Level Order Traversal
    public static List<Integer> levelOrder(Node root) {

        Queue<Node> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        // Edge case
        if (root == null) {
            return ans;
        }

        // Push root node
        q.offer(root);

        while (!q.isEmpty()) {

            Node temp = q.poll();

            ans.add(temp.data);

            // Left child
            if (temp.left != null) {
                q.offer(temp.left);
            }

            // Right child
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result = levelOrder(root);

        System.out.println(result);
    }
}

//      1
//     / \
//    5   3
//   / \
//  4   7