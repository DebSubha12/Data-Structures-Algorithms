package Array;

import java.util.*;

public class Left {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        int n = arr.length;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        System.out.println(Arrays.toString(temp));
    }
}
