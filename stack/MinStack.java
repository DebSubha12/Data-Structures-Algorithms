package stack;

import java.util.Stack;

class MinStack {

    Stack<Integer> st1;
    Stack<Integer> st2;

    // Constructor
    public MinStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    // Push element onto stack
    public void push(int val) {

        st1.push(val);

        // If min stack is empty OR new value is smaller
        if (st2.isEmpty()) {
            st2.push(val);
        } else {
            st2.push(Math.min(val, st2.peek()));
        }
    }

    // Remove top element
    public void pop() {

        if (!st1.isEmpty()) {
            st1.pop();
            st2.pop();
        }
    }

    // Get top element
    public int top() {

        if (st1.isEmpty()) {
            return -1;
        }

        return st1.peek();
    }

    // Get minimum element
    public int getMin() {

        if (st2.isEmpty()) {
            return -1;
        }

        return st2.peek();
    }

    // Main method for testing
    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("Top Element: " + obj.top());      // 2
        System.out.println("Minimum: " + obj.getMin());       // 2

        obj.pop();

        System.out.println("Top Element: " + obj.top());      // 7
        System.out.println("Minimum: " + obj.getMin());       // 3

        obj.pop();

        System.out.println("Top Element: " + obj.top());      // 3
        System.out.println("Minimum: " + obj.getMin());       // 3
    }
}