package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAllElement {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<Integer>() ;
            q.add(5);
            q.add(10);
            q.add(50);
            q.add(31);

            int n=q.size();
            while(n>0){
                System.out.print(" "+q.peek());
                q.add(q.peek());
                q.poll();
                n--;
            }
        };
    }

