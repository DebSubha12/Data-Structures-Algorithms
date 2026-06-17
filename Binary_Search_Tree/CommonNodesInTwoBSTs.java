import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class Solution {

    public ArrayList<Integer> findCommon(Node r1, Node r2) {

        ArrayList<Integer> ans = new ArrayList<>();

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        Node root1 = r1;
        Node root2 = r2;

        while (root1 != null) {
            s1.push(root1);
            root1 = root1.left;
        }

        while (root2 != null) {
            s2.push(root2);
            root2 = root2.left;
        }

        while (!s1.isEmpty() && !s2.isEmpty()) {

            if (s1.peek().data == s2.peek().data) {

                Node temp1 = s1.pop();
                Node temp2 = s2.pop();

                ans.add(temp1.data);

                root1 = temp1.right;
                root2 = temp2.right;
            }
            else if (s1.peek().data > s2.peek().data) {

                Node temp = s2.pop();
                root2 = temp.right;
            }
            else {

                Node temp = s1.pop();
                root1 = temp.right;
            }

            while (root1 != null) {
                s1.push(root1);
                root1 = root1.left;
            }

            while (root2 != null) {
                s2.push(root2);
                root2 = root2.left;
            }
        }

        return ans;
    }
}

public class CommonNodesInTwoBSTs {

    public static void main(String[] args) {

        /*
                 BST 1
                    5
                  /   \
                 1     10
                      /  \
                     7    15

                 BST 2
                    10
                   /  \
                  7    20
                 /
                1

            Common nodes = [1, 7, 10]
        */

        Node root1 = new Node(5);
        root1.left = new Node(1);
        root1.right = new Node(10);
        root1.right.left = new Node(7);
        root1.right.right = new Node(15);

        Node root2 = new Node(10);
        root2.left = new Node(7);
        root2.right = new Node(20);
        root2.left.left = new Node(1);

        Solution obj = new Solution();

        ArrayList<Integer> result = obj.findCommon(root1, root2);

        System.out.println("Common Nodes:");
        System.out.println(result);
    }
}