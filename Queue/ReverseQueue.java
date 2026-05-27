package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        int [] arr={10,30,42,4,76};
        //int q=arr.length;
         Queue<Integer> q = new LinkedList<>();

        // Insert array elements into queue
        for (int num : arr) {
            q.add(num);
        }
         Stack<Integer> st = new Stack<>(); 
        while(!q.isEmpty()){
            st.add(q.peek());
            q.poll();
        }
        while(!st.isEmpty()){
            q.add(st.peek());
            st.pop();
        }
        System.out.println(q);
    }
}
