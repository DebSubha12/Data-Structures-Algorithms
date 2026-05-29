package Queue;
    //Dequeue push-front,push-back,pop-front,pop=back,start,end Using Linkedlist
  

public class DequeueAllOperation {

    //create Node
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
            prev=null;
    }
    }

    Node Front,rear;
    public DequeueAllOperation(){
        Front=rear=null;
    }
    void push_front(int x){
        if(Front==null){
            Front=rear=new Node(x);
            return ;
        }else{
            Node temp=new Node(x);
            temp.next=Front;
            Front.prev=temp;
            Front=temp;
            return;
        }
    }
    //Push Back Method
    void push_back(int x){
        if(Front==null){
            Front=rear=new Node(x);
            return;
        }else{
            Node temp=new Node(x);
            rear.next=temp;
            temp.prev=rear;
            rear=temp;
            return;
        }
    }
    // Display deque
    void display() {
        Node temp = Front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        DequeueAllOperation dq=new DequeueAllOperation();
        dq.push_front(10);
        dq.push_front(50);
        dq.push_back(20);
        dq.push_back(90);
        dq.display();
    }
}
