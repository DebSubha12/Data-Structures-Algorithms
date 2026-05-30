package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.length;

        // Process first k-1 elements
        for (int i = 0; i < k - 1; i++) {
            if (dq.isEmpty()) {
                dq.addLast(i);
            } else {
                while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                    dq.removeLast();
                }
                dq.addLast(i);
            }
        }

        // Process remaining elements
        for (int i = k - 1; i < n; i++) {

            while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);

            // Remove indices outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            ans.add(nums[dq.peekFirst()]);
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input window size
        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        SlidingWindowMaximum sol = new SlidingWindowMaximum();
        int[] result = sol.maxSlidingWindow(nums, k);

        // Print result
        System.out.println("Maximum in each sliding window:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
