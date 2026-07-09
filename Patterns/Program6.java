package Patterns;
import java.util.Scanner;
//Pattern - 6: Inverted Numbered Right Pyramid
//    12345
//    1234
//    123
//    12
//    1

public class Program6 {
    public void pattern6(int n){
       
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
    public void pattern7(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pattern8(int n){
        //Inverted Star Pyramid
        // *********
        //  *******
        //   *****
        //    ***
        //    *
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(j=0;j<i+1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Program6 a=new Program6();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=sc.nextInt();
        
        a.pattern8(n);
    }
}
