package Recursion;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        // Negative numbers and 0 are not powers of 4
        if (n <= 0) {
            return false;
        }

        // Keep dividing n by 4 while it is divisible by 4
        while (n % 4 == 0) {
            n = n / 4;
        }

        // If n becomes 1, then it is a power of 4
        return n == 1;
    }

    // Main method for testing
    public static void main(String[] args) {
        PowerOfFour sol = new PowerOfFour();

        int n1 = 16;
        int n2 = 20;
        int n3 = 1;

        System.out.println(n1 + " is power of four: " + sol.isPowerOfFour(n1));
        System.out.println(n2 + " is power of four: " + sol.isPowerOfFour(n2));
        System.out.println(n3 + " is power of four: " + sol.isPowerOfFour(n3));
    }
}

