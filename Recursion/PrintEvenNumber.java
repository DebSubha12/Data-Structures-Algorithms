package Recursion;

public class PrintEvenNumber {
    static void print(int n) {

        // Base Case
        if (n == 2) {
            System.out.println(2);
            return;
        }

        System.out.println(n);
        print(n - 2);
    }

    public static void main(String[] args) {

        // Print even numbers from n to 1
        int n = 10;

        print(n);
    }
}

