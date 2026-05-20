package Queue;
    //Linear Queue
import java.util.Scanner;

public class AllTypesOfQueue {

    static int size = 5;
    static int[] arr = new int[size];
    static int front = -1;
    static int rear = -1;

    // Insertion
    static void insertion(int item) {

        // Overflow condition
        if (rear == size - 1) {
            System.out.println("Overflow");
            return;
        }

        // First insertion
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = rear + 1;
        }

        arr[rear] = item;
        System.out.println(item + " Inserted");
    }

    // Deletion
    static void deletion() {

        // Underflow condition
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
            return;
        }

        System.out.println("Deleted Item : " + arr[front]);

        front = front + 1;

        // Reset queue when empty
        if (front > rear) {
            front = rear = -1;
        }
    }

    // Display Queue
    static void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, item;

        do {

            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Item to Insert: ");
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
                    System.out.println("Program Exited");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}