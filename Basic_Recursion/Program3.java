// import java.util.Scanner;

// public class Program3 {
//      public void PrintNumber(int i, int n) {
//           if (i > n) {
//                return;
//           }
            
//           PrintNumber(i + 1, n);
//           System.out.println(i + "");
//      }

// }

// class Main {
//      public static void main(String[] args) {
//           Program3 main = new Program3();
//           Scanner sc = new Scanner(System.in);
//           System.out.print("Enter that number to until print :");
//           int n = sc.nextInt();
//           sc.nextLine();
//           main.PrintNumber(1, n);
//      }

// }




import java.util.Scanner;

public class Program3 {

    public void printNumber(int i, int n) {
        if (i == n) {
            return;
        }

        // recursive call first
        printNumber(i - 1, n);

        // backtracking step (prints while returning)
        System.out.println(i);
    }
}

class Main {
    public static void main(String[] args) {
        Program3 obj = new Program3();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number until print: ");
        int n = sc.nextInt();

        obj.printNumber(n, n);
    }
}







