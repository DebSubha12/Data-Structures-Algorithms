package Array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5};
        int largestElement=arr[0];
        int n=arr.length;
        int i;
        for( i=0;i<n;i++){
            if (arr[i]>largestElement){
                largestElement=arr[i];
            }
        }
        int secondLargest=-1;
        for( i=0;i<n;i++){
           if(arr[i]>secondLargest && arr[i]!=largestElement){
            secondLargest=arr[i];
        }  
        }
        //int i;
        System.out.println("Original array "+Arrays.toString(arr));
        System.out.println("Largest Element :"+largestElement);
        System.out.println("Second Largest :"+ secondLargest);
    }
    
}
