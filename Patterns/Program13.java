package Patterns;
import java.util.Scanner;

//  1
//  2 3
//  4 5 6
//  7 8 9 10
//  11 12 13 14 15

public class Program13 {
    int num=1;
    public void pattern13(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num +=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            Program13  a=new Program13();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=sc.nextInt();
        
        a.pattern13(n);
        }
}
