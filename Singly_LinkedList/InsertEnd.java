package Singly_LinkedList;

public class InsertEnd {
     static  class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {

        Node head = null;
        Node tail = null;

        int[] arr = {2, 4, 6, 8, 10};

        // Insert elements at end (O(1) using tail)
        for (int i = 0; i < arr.length; i++) {

            // Linked list is empty
            if (head == null) {
                head = new Node(arr[i]);
                tail = head;
            } 
            // Linked list already exists
            else {
                tail.next = new Node(arr[i]);
                tail = tail.next;
            }
        }

        // Traversal (printing the list)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
