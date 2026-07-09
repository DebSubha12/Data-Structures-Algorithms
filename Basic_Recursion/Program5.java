import java.util.Scanner;

public class Program5 {

    // Change return type from void → int
    public int functionalNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n + functionalNumber(n - 1);
    }
    public static void main(String[] args) {
        Program5 a = new Program5();
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println(a.functionalNumber(n));   // Output: 6
    }
}



