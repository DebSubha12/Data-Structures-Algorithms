package Singly_LinkedList;

public class RemoveNthNodeFromEnd {
    public  static class Node{
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node removeNth(Node head,int n){
        Node fast=head;
        Node slow=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if (fast==null) {
            return head.next;
        }

        while (fast!=null && fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
    return head;
    }
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd obj=new RemoveNthNodeFromEnd();
        
         // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        

        System.out.println("Original List:");
        obj.printList(head);

        head=removeNth(head, 2);

         System.out.println("Original List After:");
        obj.printList(head);
    }
}
