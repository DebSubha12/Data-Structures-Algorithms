package Basic_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashingUsingMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // precompute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int value = 0;
            if (mp.containsKey(key))
                value = mp.get(key);
            value++;
            mp.put(key, value);
        }
        System.out.print("Enter number of queries:");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter a number to check frequency:");
            int number = sc.nextInt();
            // fetch
            // if(mp.containsKey(number) System.out.println(mp.get(number)));
            if (mp.containsKey(number))
                System.out.println("Frequency of " + number + " is :" + mp.get(number));
            else
                System.out.println(0);
        }
    }
}
