package Patterns;
import java.util.Scanner;


public class Program3 {
    public void pattern3(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            Program3 a=new Program3();
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a Number");
            int n=sc.nextInt();
            a.pattern3(n);
    }
}


