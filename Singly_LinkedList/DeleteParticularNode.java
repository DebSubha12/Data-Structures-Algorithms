package Singly_LinkedList;

public class DeleteParticularNode {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Create linked list using recursion
    static Node createLinkedList(int arr[], int index, int size) {
        if (index == size) {
            return null;
        }

        Node temp = new Node(arr[index]);
        temp.next = createLinkedList(arr, index + 1, size);
        return temp;
    }
    static Node deleteNode(Node head, int x) {
    // Case 1: empty list
    if (head == null) return null;

    // Case 2: delete first node
    if (x == 1) {
        return head.next;
    }

    x--;
    Node curr = head;
    Node prev = null;

    // Traverse safely
    while (x-- > 0 && curr != null) {
        prev = curr;
        curr = curr.next;
    }

    // Case 3: x is out of bounds
    if (curr == null) return head;

    // Delete node
    prev.next = curr.next;

    return head;
}
 static Node deleteNodeUsingRecursion(Node curr,int y){
    
    if (curr == null) return null;

    if(y==1){
        Node temp=curr.next;
        temp.next=curr.next;
        return temp;
    }
    curr.next=deleteNodeUsingRecursion(curr.next,y+1);
    return curr;
 }


 // Print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };

        Node head = createLinkedList(arr, 0, arr.length);
          System.out.print("Original List: ");
        printList(head);

       // int x = 3; // delete 3rd node
    //head = deleteNode(head, x);

    int y=3;
    head=deleteNodeUsingRecursion( head, y);


        System.out.print("After Deletion: ");
        printList(head);
}
}
