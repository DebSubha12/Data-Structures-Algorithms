package Sorting;

import java.util.Scanner;

public class BubbleSort {

    // 👉 Method to perform Bubble Sort on an array
    public void bubbleSort(int[] arr) {

        // 👉 Get length of array
        int n = arr.length;

        // 👉 Outer loop controls number of passes
        // After each pass, largest element moves to correct position at end
        for (int i = n - 1; i >= 0; i--) {

            // 👉 Flag to check if any swap happens in this pass
            // Helps in optimization (stop if already sorted)
            boolean didSwap = false;

            // 👉 Inner loop for comparing adjacent elements
            for (int j = 0; j <= i - 1; j++) {

                // 👉 Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // 👉 Swap if left element is greater than right
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    // 👉 Mark that a swap happened
                    didSwap = true;
                }
            }

            // 👉 If no swaps occurred, array is already sorted
            if (!didSwap) {
                break;
            }
        }

        // 👉 Print sorted array
        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 👉 Scanner for user input
        Scanner sc = new Scanner(System.in);

        // 👉 Input array size
        int n = sc.nextInt();

        // 👉 Create array of given size
        int[] arr = new int[n];

        // 👉 Take array elements as input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 👉 Print array before sorting
        System.out.println("Before Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 👉 Create object and call bubble sort method
        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(arr);
    }
}
