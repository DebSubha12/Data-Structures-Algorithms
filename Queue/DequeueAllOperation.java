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
    //Pop Front Means Delete elemrnt in front
    void pop_front(){
        if(Front==null){
            return;}
            Front =Front.next;
            if(Front!=null){
                Front.prev=null;
            }else{
                rear=null;
            }
    }
    //pop Back
    void pop_back(){
        if(Front==null){
            return;
        }else{
            Node temp=rear;
            rear=rear.prev;
            if(rear!=null){
                rear.next=null;
            }else{
                Front=null;
            }
        }
    }
    //start() method
    void start(){
        if(Front==null){
            System.out.println("Deque is empty");
        }else{
            System.out.println( Front.data);
        }
    }
    //End() method
    void end(){
          if(Front==null){
             System.out.println("Deque is empty");
        }else{
            System.out.println( rear.data);
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
        dq.push_back(48);
        dq.push_back(23);
        dq.display();
        dq.pop_front();
        System.out.println("After Delete/pop First Element");
        dq.display();
        dq.pop_back();
        System.out.println("After Delete Last Element:");
        dq.display();
        System.out.print("The First Element:");
        dq.start();
        System.out.print("The Last Element:");
        dq.end();
    }
}
