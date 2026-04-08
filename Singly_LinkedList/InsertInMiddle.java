package Singly_LinkedList;

public class InsertInMiddle {

    // Node class representing each element of the linked list
    static class Node {
        int data;     // stores data
        Node next;    // pointer to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive function to create linked list from array
    static Node createLinkedList(int arr[], int index, int size) {
        // Base case: if index reaches size, stop recursion
        if (index == size) {
            return null;
        }

        // Create new node with current array element
        Node temp = new Node(arr[index]);

        // Link current node to next node (recursive call)
        temp.next = createLinkedList(arr, index + 1, size);

        return temp;
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};

        // Create linked list from array
        Node head = createLinkedList(arr, 0, arr.length);

        int x = 2;       // position where node will be inserted (0-based index)
        int value = 30; // value to insert

        Node temp = head;

        // Traverse to (x-1)th node
        // because insertion happens AFTER this node
        for (int i = 0; i < x - 1; i++) {
            temp = temp.next;
        }

        // Create new node to be inserted
        Node newNode = new Node(value);

        // Adjust links:
        // Step 1: new node points to next node
        newNode.next = temp.next;

        // Step 2: previous node points to new node
        temp.next = newNode;

        // Print the updated linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}