package Patterns;
import java.util.Scanner;


public class Program4 {
   
    public void pattern4(int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            Program4 a=new Program4();
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a Number");
            int n=sc.nextInt();
            a.pattern4(n);
    }
}




