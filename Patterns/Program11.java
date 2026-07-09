package Patterns;
import java.util.Scanner;
//Binary Number Triangle Pattern
//    1
//    01
//    101
//    0101
//    10101


public class Program11 {
    public void pattern11(int n){
            int start;
            for(int i=0;i<n;i++){
                if(i%2==0) start=1;
                else start=0;
                for(int j=0;j<=i;j++){
                    System.out.print(start);
                    start=1-start;
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Program11 a=new Program11();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=sc.nextInt();
        
        a.pattern11(n);
        }
}


