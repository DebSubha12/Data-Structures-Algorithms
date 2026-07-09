package Patterns;
import java.util.Scanner;
public class Program2 {
    

    public  void pattern2(int N){
        for (int i = 0; i < N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 0; j <= i; j++) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Program2 a=new Program2();
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int N=sc.nextInt();
        a.pattern2(N);
        sc.close();
    }
}


