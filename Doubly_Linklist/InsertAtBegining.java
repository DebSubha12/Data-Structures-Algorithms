package Doubly_Linklist;

public class InsertAtBegining {

    // Head node of doubly linked list
    static Node head = null;

    // Node class
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Method to insert at beginning
    public static void insertAtBeginning(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = new Node(data);
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    // Method to display list
    public static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertAtBeginning(5);
        insertAtBeginning(10);
        insertAtBeginning(15);

        display();
    }
}