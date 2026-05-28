package Queue;

import java.util.Stack;

public class QueueUsingStack {
      // Stack used for push operation
    Stack<Integer> st1;

    // Stack used for pop and peek operations
    Stack<Integer> st2;

    // Constructor to initialize both stacks
    public QueueUsingStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    // Add element to the queue
    public void push(int x) {

        // Always push into st1
        st1.push(x);
    }

    // Remove element from the front of the queue
    public int pop() {

        // Check if queue is empty
        if (empty()) {
            return -1;
        }

        /*
         Transfer elements from st1 to st2
         only if st2 is empty.
         This reverses the order and gives FIFO behavior.
        */
        if (st2.isEmpty()) {

            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        // Remove and return front element
        return st2.pop();
    }

    // Get front element without removing it
    public int peek() {

        // Check if queue is empty
        if (empty()) {
            return -1;
        }

        /*
         If st2 is empty,
         transfer all elements from st1 to st2
        */
        if (st2.isEmpty()) {

            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        // Return front element
        return st2.peek();
    }

    // Check whether queue is empty
    public boolean empty() {

        // Queue is empty when both stacks are empty
        return st1.isEmpty() && st2.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {

        // Create queue object
        QueueUsingStack q = new QueueUsingStack();

        // Insert elements into queue
        q.push(10);
        q.push(20);
        q.push(30);

        // Display front element
        System.out.println("Front element: " + q.peek());

        // Remove front element
        System.out.println("Removed: " + q.pop());

        // Display new front element
        System.out.println("Front element after pop: " + q.peek());

        // Check queue status
        System.out.println("Is queue empty? " + q.empty());

        // Remove remaining elements
        System.out.println("Removed: " + q.pop());
        System.out.println("Removed: " + q.pop());

        // Final empty check
        System.out.println("Is queue empty now? " + q.empty());
    }
}
