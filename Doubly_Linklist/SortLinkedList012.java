package Doubly_Linklist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortLinkedList012 {

    public static Node sortList(Node head) {
        Node curr = head;

        int count0 = 0, count1 = 0, count2 = 0;

        // Step 1: Count 0s, 1s, and 2s
        while (curr != null) {
            if (curr.data == 0) {
                count0++;
            } else if (curr.data == 1) {
                count1++;
            } else {
                count2++;
            }
            curr = curr.next;
        }

        // Step 2: Overwrite the linked list
        curr = head;

        while (count0-- > 0) {
            curr.data = 0;
            curr = curr.next;
        }

        while (count1-- > 0) {
            curr.data = 1;
            curr = curr.next;
        }

        while (count2-- > 0) {
            curr.data = 2;
            curr = curr.next;
        }

        return head;
    }

    // Utility to print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Before sorting:");
        printList(head);

        head = sortList(head);

        System.out.println("After sorting:");
        printList(head);
    }
}