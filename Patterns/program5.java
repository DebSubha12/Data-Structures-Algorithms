package Patterns;
import java.util.Scanner;

//  The pattern is
//  *****
//  ****
//  ***
//  **
//  *


public class program5 {
    public void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        program5 a=new program5();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        a.pattern5(n);
    }
}
