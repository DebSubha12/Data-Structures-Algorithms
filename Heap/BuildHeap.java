package Heap;

public class BuildHeap {
    // Heapify
    public static void heapify(int[] arr, int index, int n) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;

            heapify(arr, largest, n);
        }
    }
     // Build Max Heap
    public static void buildMaxHeap(int[] arr, int n) {
        // Step Down  Find the last non-leaf node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }
    // Print Heap
    public static void printHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = {10, 3, 8, 9, 5, 13, 18, 14, 11, 70};

        buildMaxHeap(arr, arr.length);

        printHeap(arr);
    }
}


// Time Complexity
// Heapify: O(log n)
// Build Max Heap: O(n)
// Print Heap: O(n)
