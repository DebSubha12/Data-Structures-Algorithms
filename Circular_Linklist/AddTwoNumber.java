package Circular_Linklist;

public class AddTwoNumber {
     // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node Reverse(Node curr, Node prev) {

        if (curr == null)
            return prev;

        Node front = curr.next;
        curr.next = prev;

        return Reverse(front, curr);
    }

    public Node addTwoNumbers(Node l1, Node l2) {

        Node first = Reverse(l1, null);
        Node second = Reverse(l2, null);

        Node curr1 = first;
        Node curr2 = second;

        int carry = 0;

        Node head = new Node(0);
        Node tail = head;

        while (curr1 != null && curr2 != null) {

            int sum = curr1.data + curr2.data + carry;

            tail.next = new Node(sum % 10);
            tail = tail.next;

            carry = sum / 10;

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        while (curr1 != null) {

            int sum = curr1.data + carry;

            tail.next = new Node(sum % 10);
            tail = tail.next;

            carry = sum / 10;

            curr1 = curr1.next;
        }

        while (curr2 != null) {

            int sum = curr2.data + carry;

            tail.next = new Node(sum % 10);
            tail = tail.next;

            carry = sum / 10;

            curr2 = curr2.next;
        }

        while (carry != 0) {

            tail.next = new Node(carry % 10);
            tail = tail.next;

            carry /= 10;
        }

        head = Reverse(head.next, null);

        return head;
    }
// Print Linked List
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        AddTwoNumber obj = new AddTwoNumber();

        // First number: 243
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // Second number: 564
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        // Add numbers
        Node result = obj.addTwoNumbers(l1, l2);

        // Print result
        System.out.print("Result: ");
        printList(result);
    }
}
