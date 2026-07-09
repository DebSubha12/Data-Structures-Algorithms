//print Name n times using recursion

import java.util.Scanner;

public class Program1 {
    public void printName(String name,int i,int n){
        if (i>n){
            return;
        }
        System.out.println(name);
             
        printName(name, i+1, n);
    }
    public static void main(String[] args) {
            Program1 a=new Program1();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number :");
            int n=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter that name :");
            String name=sc.nextLine();
            a.printName(name,1,n);
    }
}
