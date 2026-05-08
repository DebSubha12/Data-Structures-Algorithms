package Circular_Linklist;

import java.util.ArrayList;

public class DetectLoop {
     static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// Function to check whether current node already exists
    static boolean check(ArrayList<Node> visited, Node curr) {

        for (int i = 0; i < visited.size(); i++) {

            if (visited.get(i) == curr) {
                return true;
            }
        }

        return false;
    }

    // Function to detect loop in linked list
    static boolean detectLoop(Node head) {

        Node curr = head;

        ArrayList<Node> visited = new ArrayList<>();

        while (curr != null) {

            // Check if node already visited
            if (check(visited, curr)) {
                return true;
            }

            // Store current node
            visited.add(curr);

            // Move to next node
            curr = curr.next;
        }

        return false;
    }
    public static void main(String[] args) {
          // Creating linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating loop
        head.next.next.next.next = head.next;

        if (detectLoop(head)) {
            System.out.println("Loop Detected");
        } else {
            System.out.println("No Loop");
        }
    }
    }

