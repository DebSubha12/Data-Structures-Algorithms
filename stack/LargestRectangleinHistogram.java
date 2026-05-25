package stack;

import java.util.Stack;

public class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Next Smaller Element on Right
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                right[st.peek()] = i;
                st.pop();
            }

            st.push(i);
        }

        while (!st.isEmpty()) {
            right[st.peek()] = n;
            st.pop();
        }

        // Previous Smaller Element on Left
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                left[st.peek()] = i;
                st.pop();
            }

            st.push(i);
        }

        while (!st.isEmpty()) {
            left[st.peek()] = -1;
            st.pop();
        }

        // Find Maximum Area
        int ans = 0;

        for (int i = 0; i < n; i++) {

            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;

            ans = Math.max(ans, area);
        }

        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {

        LargestRectangleinHistogram sol = new LargestRectangleinHistogram();

        int[] heights = {2, 1, 5, 6, 2, 3};

        int result = sol.largestRectangleArea(heights);

        System.out.println("Largest Rectangle Area: " + result);
    }
}
