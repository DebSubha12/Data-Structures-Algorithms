public class First1 {

            //Index of First 1 in a Binary Sorted Infinite Array

            
    public static int indexOfFirstOne(int arr[],int target){
        int low = 0, high = 1;
        while (target > arr[high]) {
            low = high;
            high = high * 2;
        }
        int res = -1;

        // Standard Binary Search loop
        while (low <= high) {

            // Calculate middle index
            int mid = low + (high - low) / 2;

            // If target is found
            if (arr[mid] == target) {
                res = mid;          // store index
                high = mid - 1;     // move LEFT to check if another target exists before it
            }

            // If target is greater than middle element
            else if (arr[mid] < target) {
                low = mid + 1;      // search in right half
            }

            // If target is smaller than middle element
            else {
                high = mid - 1;     // search in left half
            }
        }

        // Return index of first occurrence
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0, 0, 1, 1, 1, 1};
        int target=1;
        int result=indexOfFirstOne( arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
