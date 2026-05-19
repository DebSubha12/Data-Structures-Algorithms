package stack;
            //Next Largest Element / Nearest greater to right
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NGP {
     public static void nextGreaterElement(int[] arr) {

        int n = arr.length;

        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            if (s.isEmpty()) {
                v.add(-1);
            }

            else if (!s.isEmpty() && s.peek() > arr[i]) {
                v.add(s.peek());
            }

            else {

                while (!s.isEmpty() && s.peek() <= arr[i]) {
                    s.pop();
                }

                if (s.isEmpty()) {
                    v.add(-1);
                } else {
                    v.add(s.peek());
                }
            }

            s.push(arr[i]);
        }

        Collections.reverse(v);

        System.out.println(v);
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4};

        nextGreaterElement(arr);
    }
}

