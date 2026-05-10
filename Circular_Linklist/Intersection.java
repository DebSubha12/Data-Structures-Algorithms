package Circular_Linklist;

public class Intersection {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to find intersection node
    public Node getIntersectionNode(Node headA, Node headB) {

        if (headA == null || headB == null) {
            return null;
        }

        // Find tail of list A
        Node curr1 = headA;

        while (curr1.next != null) {
            curr1 = curr1.next;
        }

        // Connect tail of A to headA (make cycle)
        curr1.next = headA;

        Node slow = headB;
        Node fast = headB;

        // Floyd Cycle Detection
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // Cycle found
            if (slow == fast) {

                // Find starting point of cycle
                slow = headB;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Restore original list
                curr1.next = null;

                return slow;
            }
        }

        // Restore original list if no intersection
        curr1.next = null;

        return null;
    }

    public static void main(String[] args) {

        /*
            Creating intersection:

            A: 4 -> 1 \
                          8 -> 4 -> 5
            B: 5 -> 6 -> 1 /
        */

        // Common part
        Node common = new Node(8);
        common.next = new Node(4);
        common.next.next = new Node(5);

        // List A
        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = common;

        // List B
        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(1);
        headB.next.next.next = common;

        // Object of class
        Intersection obj = new Intersection();

        // Find intersection
        Node intersection = obj.getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection Node Value: " + intersection.data);
        } else {
            System.out.println("No Intersection Found");
        }
    }
}