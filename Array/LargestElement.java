package Array;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        //int[] arr={3,2,1,5,2};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int LargestElement=arr[0];
        //int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>LargestElement){
                LargestElement=arr[i];
            }
        }
        System.out.println("Largest Element is :"+LargestElement);
    }
}


// package Array;

// public class LargestElement {
//     public static void main(String[] args) {
//         int[] arr = {3, 2, 1, 5, 2};

//         int largestElement = arr[0];   // declare variable
//         int n = arr.length;            // define n

//         for (int i = 0; i < n; i++) {
//             if (arr[i] > largestElement) {
//                 largestElement = arr[i];
//             }
//         }

//         System.out.println(largestElement);
//     }
// }
