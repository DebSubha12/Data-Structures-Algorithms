package Circular_Linklist;

public class FindLengthOfLoop {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to find length of loop
    public int findLengthOfLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // Loop detected
            if (slow == fast) {

                int count = 1;

                slow = fast.next;

                while (slow != fast) {
                    count++;
                    slow = slow.next;
                }

                return count;
            }
        }

        // No loop
        return 0;
    }

    public static void main(String[] args) {

        FindLengthOfLoop obj = new FindLengthOfLoop();

        // Creating linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating loop
        head.next.next.next.next.next = head.next;

        int length = obj.findLengthOfLoop(head);

        if (length > 0) {
            System.out.println("Length of Loop: " + length);
        } else {
            System.out.println("No Loop Found");
        }
    }
}