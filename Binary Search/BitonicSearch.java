public class BitonicSearch {

    // Find peak element index
    static int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // move right
            } else {
                high = mid; // move left
            }
        }
        return low;
    }

    // Binary search for increasing part
    static int binarySearchAsc(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Binary search for decreasing part
    static int binarySearchDesc(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

     // Main search function
    static int searchBitonic(int[] arr, int key) {
        int peak = findPeak(arr);

        // Search in left part
        int left = binarySearchAsc(arr, 0, peak, key);
        if (left != -1)
            return left;

        // Search in right part
        return binarySearchDesc(arr, peak + 1, arr.length - 1, key);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 9, 5, 2};
        int key = 9;

        int index = searchBitonic(arr, key);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}