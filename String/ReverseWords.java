package String;

import java.util.Scanner;

public class ReverseWords {
        public String reverseWords(String s) {
        String[] word=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a input:");
        String s=sc.nextLine();
        ReverseWords obj=new ReverseWords();
        String result=obj.reverseWords(s);
        System.out.println("Result: " + result);
        sc.close();
    }
}