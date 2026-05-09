package Circular_Linklist;

public class DetectCycleStart {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to detect starting node of cycle
    public Node detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // Cycle detected
            if (slow == fast) {

                // Step 2: Find starting node
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        // No cycle
        return null;
    }

    public static void main(String[] args) {

        DetectCycleStart obj = new DetectCycleStart();

        // Creating linked list
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        // Creating cycle
        head.next.next.next.next = head.next;

        // Detect cycle start
        Node result = obj.detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at node: " + result.data);
        } else {
            System.out.println("No Cycle Found");
        }
    }
}