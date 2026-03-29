package String;

import java.util.Scanner;

public class ReverseVowel {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        
        // Convert string to char array
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Move left pointer until it finds a vowel
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            
            // Move right pointer until it finds a vowel
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }
            
            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a input:");
        String s=sc.nextLine();
        ReverseVowel obj=new ReverseVowel();
        String result=obj.reverseVowels(s);
        System.out.println("The Result:"+result);
    }
}
