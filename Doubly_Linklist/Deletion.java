package Doubly_Linklist;

public class Deletion {

    static Node head; // Make head global

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

    static Node CreateDLL(int arr[], int index, int size, Node back) {
        if (index == size) {
            return null;
        }

        Node temp = new Node(arr[index]);
        temp.prev = back;
        temp.next = CreateDLL(arr, index + 1, size, temp);

        return temp;
    }

    // Delete At start
    static void deleteAtStart() {
        if (head.next == null) { // if 1 node exits
            head = null;
        }
        // if more than 1 node
        else {
            // Node temp = head;
            head = head.next;
            head.prev = null;
        }
    }

    // Delete At End
    static void deleteAtEnd() {
        if (head.next == null) { // if 1 node exits
            head = null;
        } else {
            Node curr = head;
            // go to last node
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.prev.next = null;
        }
    }

    static void deleteAtGivenPosition(){
    int position=5;

    if (head==null) {
        return;
    }
        //delete at starting 
        if(position==1){
            if (head.next == null) { // if 1 node exits
            head = null;
        }
        // if more than 1 node
        else {
            // Node temp = head;
            head = head.next;
            head.prev = null;
        }
        return;
     }
     else{
        Node curr=head;
        while (position>1 && curr!=null) {
            curr=curr.next;
            position--;
        }
        // Invalid position
    if (curr == null) {
        return;
    }
        if (curr.next==null) {
            curr.prev.next=null;
        }else{
            curr.prev.next=curr.next;
            curr.next.prev=curr.prev;
        }
     }
    }

    public static void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        head = CreateDLL(arr, 0, 5, null);

        //deleteAtStart();
       // deleteAtEnd();
       deleteAtGivenPosition();
        display();

        
        
    }
}