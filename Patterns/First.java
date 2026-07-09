package Patterns;

import java.util.Scanner;

class First {
    // Function to print a square pattern of stars
    public void pattern1(int N) {
        // Outer loop to handle rows
        for (int i = 0; i < N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 0; j < N; j++) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        First sol = new First();
        Scanner sc=new Scanner(System.in);

        int N = sc.nextInt(); // Set the size of the square (5x5)
        sol.pattern1(N); // Call the function to print the pattern
    }
}