package stack;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    // Main method
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // 3

        System.out.println("Popped element: " + stack.pop()); // 3

        System.out.println("Top element after pop: " + stack.top()); // 2

        System.out.println("Is stack empty? " + stack.empty()); // false
    }
}