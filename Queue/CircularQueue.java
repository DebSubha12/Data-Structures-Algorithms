package Queue;

import java.util.Scanner;

public class CircularQueue {
    static int size=5;
    static int [] arr=new int[size];
    static int front=-1;
    static int rear=-1;
    static int item;
     static void insertion(int item){

    if((front==0 && rear== size-1) || (front==rear+1)){
        System.out.println("Overflow");
        return;
    }

    if(front==-1){
        front=rear=0;
    }
    else if(rear==size-1){
        rear=0;
    }
    else{
        rear=rear+1;
    }

    arr[rear]=item;
}
     static void deletion(){

    if(front==-1){
        System.out.println("Underflow");
        return;
    }

    System.out.println(arr[front] + " deleted");

    if(front==rear){
        front=rear=-1;
    }
    else if(front==size-1){
        front=0;
    }
    else{
        front=front+1;
    }
}
      static void display(){

    if(front==-1){
        System.out.println("Queue is Empty");
        return;
    }

    System.out.println("Queue elements:");

    if(front <= rear){

        for(int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }

    } else {

        for(int i=front; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i=0; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
    }

    System.out.println();
}
      
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, item;

        do {
            System.out.println("\n--- Circular Queue Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter item to insert: ");
                    item = sc.nextInt();
                    insertion(item);
                    break;

                case 2:
                    deletion();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
      }

