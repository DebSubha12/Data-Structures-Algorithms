//Print Number Linearly from 1 to n

import java.util.Scanner;

public class Program2 {
     public void PrintNumber(int i, int n) {
          if (i > n) {
               return;
          }
          System.out.println(i + "");
          PrintNumber(i + 1, n);
     }

}

class Main {
     public static void main(String[] args) {
          Program2 main = new Program2();
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter that number to until print :");
          int n = sc.nextInt();
          main.PrintNumber(1, n);
     }

}
