public class CountElement {

    // Function to find the FIRST occurrence of the target element
    static int Firstoccurrence(int arr[], int target) {

        // low → start index
        // high → end index
        // res → stores the index of first occurrence
        int low = 0, high = arr.length - 1, res = -1;

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


    // Function to find the LAST occurrence of the target element
    static int LastOccurrence(int arr[], int x) {

        int low = 0, high = arr.length - 1;

        // result stores the last index where target appears
        int result = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // If target found
            if (arr[mid] == x) {

                result = mid;      // store index
                low = mid + 1;     // move RIGHT to check if another target exists after it
            }

            // If target greater than middle element
            else if (arr[mid] < x) {

                low = mid + 1;     // search right half
            }

            // If target smaller than middle element
            else {

                high = mid - 1;    // search left half
            }
        }

        // Return index of last occurrence
        return result;
    }


    // Function to count how many times target appears in array
    static int CountElement(int arr[], int target){

        // Find first occurrence
        int first = Firstoccurrence(arr, target);

        // If element is not present
        if(first == -1){
            return 0;
        }

        // Find last occurrence
        int last = LastOccurrence(arr, target);

        // Total occurrences formula
        return last - first + 1;
    }


    // Main function → program starts here
    public static void main(String[] args) {

        // Sorted array (required for Binary Search)
        int arr[] = { 2, 5, 10, 10, 10, 18, 20 };

        // Element we want to count
        int target = 10;

        // Call function to count occurrences
        int count = CountElement(arr, target);

        // Print result
        System.out.println("Count of " + target + " is " + count);
    }
}