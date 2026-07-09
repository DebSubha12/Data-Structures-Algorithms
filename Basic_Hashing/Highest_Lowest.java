package Basic_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Highest_Lowest {
    public void Frequency(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }

            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }

        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number:");
       int n=sc.nextInt();

       int[] arr=new int[n];

       System.out.print("Enter a Element :");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       
        Highest_Lowest fc=new Highest_Lowest();
        fc.Frequency(arr, n);

    }
}
