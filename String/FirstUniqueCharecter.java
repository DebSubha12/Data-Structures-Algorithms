package String;

        //First Unique Character in a String | LeetCode problem 387

import java.util.Scanner;

public class FirstUniqueCharecter {
    public int firstUniqueCharecter(String s){
        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;   // increase count
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        FirstUniqueCharecter obj=new FirstUniqueCharecter();
        int result=obj.firstUniqueCharecter( s);
        System.out.print("The result is:"+result);
    }
}