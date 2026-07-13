package Heap;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add first k elements to the min heap
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }

        // Process the remaining elements
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > pq.peek()) {
                pq.poll();
                pq.add(nums[i]);
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = findKthLargest(nums, k);

        System.out.println("The " + k + "nd largest element is: " + result);
    }
}