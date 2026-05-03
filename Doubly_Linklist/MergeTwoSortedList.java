package Doubly_Linklist;

public class MergeTwoSortedList {
     static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 public static Node sortedMerge(Node head1, Node head2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next;
    }

     public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

     public static void main(String[] args) {

        // First Linked List: 1 -> 3 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(5);

        // Second Linked List: 2 -> 4 -> 6
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.println("List 1:");
        printList(head1);

        System.out.println("List 2:");
        printList(head2);

        Node mergedHead = sortedMerge(head1, head2);

        System.out.println("Merged List:");
        printList(mergedHead);
    }
}
