package Basic_Hashing;

import java.util.Scanner;

public class CharLowercase {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a lowercase string (e.g., abcdef): ");
        String input = scanner.next();

        // Precompute character frequencies
        int[] frequency = new int[26];  // 26 letters from 'a' to 'z'

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency[ch - 'a']++;
        }

        // Read number of queries
        System.out.print("Enter number of queries: ");
        int queries = scanner.nextInt();

        // Process each query
        while (queries-- > 0) {
            System.out.print("Enter a character to check frequency: ");
            char queryChar = scanner.next().charAt(0);

            // Display frequency
            System.out.println(
                "Frequency of '" + queryChar + "' is: " +
                frequency[queryChar - 'a']
            );
        }

        // Close scanner
        scanner.close();
    }
}
