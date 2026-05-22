package Queue;
//add
public class RainWaterTraping {

    public int trap(int[] height) {

        int i, n = height.length;

        int[] mxl = new int[n];
        int[] mxr = new int[n];

        // Left max array
        mxl[0] = height[0];

        for (i = 1; i < n; i++) {
            mxl[i] = Math.max(mxl[i - 1], height[i]);
        }

        // Right max array
        mxr[n - 1] = height[n - 1];

        for (i = n - 2; i >= 0; i--) {
            mxr[i] = Math.max(mxr[i + 1], height[i]);
        }

        // Water stored at each index
        int[] water = new int[n];

        for (i = 0; i < n; i++) {
            water[i] = Math.min(mxl[i], mxr[i]) - height[i];
        }

        // Total trapped water
        int sum = 0;

        for (i = 0; i < n; i++) {
            sum = sum + water[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] height = {3, 0, 0, 2, 0, 4};

        RainWaterTraping obj = new RainWaterTraping();

        int result = obj.trap(height);

        System.out.println("Trapped Water = " + result);
    }
}
