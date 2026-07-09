package Sorting;

import java.util.Scanner;

public class SelectionSort {

    // 👉 Selection Sort method
    // arr = array to be sorted
    // n = size of array
    static void selectionSort(int[] arr, int n) {

        // 👉 Outer loop: moves boundary of unsorted part
        // After each pass, smallest element goes to correct position
        for (int i = 0; i < n - 1; i++) {

            // 👉 Assume current index has minimum element
            int min_idx = i;

            // 👉 Inner loop: find actual minimum in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j; // update min index
                }
            }

            // 👉 Swap smallest found element with current position
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        // 👉 Print sorted array
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 👉 Scanner for user input
        Scanner sc = new Scanner(System.in);

        // 👉 Input array size
        int n = sc.nextInt();

        // 👉 Create array of size n
        int[] arr = new int[n];

        // 👉 Take n elements as input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 👉 Print array before sorting
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 👉 Call selection sort function
        selectionSort(arr, n);

        // 👉 Close scanner to prevent resource leak
        sc.close();
    }
}
