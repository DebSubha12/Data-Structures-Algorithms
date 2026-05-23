package stack;

import java.util.Scanner;

class AllOperation {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    // Push operation
    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

   
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object of custom stack class
        AllOperation s = new AllOperation();

        int choice, value;

        do {
            System.out.println("\n--- Stack Operations ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}