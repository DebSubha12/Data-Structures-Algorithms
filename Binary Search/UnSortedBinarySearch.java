import java.util.Arrays;
import java.util.Scanner;
  //Write a program to implement binary search for an unsorted user given array
public class UnSortedBinarySearch {
    static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter number of elements: ");
         int n = sc.nextInt();
         int arr[] = new int[n];
         //input
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         Arrays.sort(arr); // sort the array
          System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int result = binarySearch(arr, key); //call the method
         if(result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
