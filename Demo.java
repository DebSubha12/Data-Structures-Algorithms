class GFG {

    static int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;        // store index
                low = mid + 1;      // move left to find first occurrence
            }
            else if (arr[mid] < x) {
                low = mid + 1;       // search right
            }
            else {
                high = mid - 1;      // search left
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int arr[] = {2,4,10,10,10,18,20};
        int x = 10;

        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("last occurrence of element " + x + " is at index " + result);
    }
}