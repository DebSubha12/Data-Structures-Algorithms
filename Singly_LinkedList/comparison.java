package Singly_LinkedList;

//         Write a program to print the following for a single linked list

// (Sum of odd position elements) - (sum of even position elements)


public class comparison {
    static  class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(50);
        head.next.next.next = new Node(30);

        int odd=1, even =1, position=1;
        while(head!=null){
            if(position % 2 ==1){
                odd=odd+head.data;
            }else{
                even=even+head.data;
            }
            position++;
            head=head.next;
        }
        System.out.println("Final Result:"+(odd-even));
    }
}
