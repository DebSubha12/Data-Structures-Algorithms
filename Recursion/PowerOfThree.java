package Recursion;

public class PowerOfThree {
     public boolean isPowerOfThree(int n) {
        // Negative numbers and 0 are not powers of 3
        if (n <= 0) {
            return false;
        }

        // Keep dividing n by 3 while it is divisible by 3
        while (n % 3 == 0) {
            n = n / 3;
        }

        // If n becomes 1, then it is a power of 3
        return n == 1;
    }

    // Main method for testing
    public static void main(String[] args) {
        PowerOfThree sol = new PowerOfThree();

        int n1 = 27;
        int n2 = 45;
        int n3 = 1;

        System.out.println(n1 + " is power of three: " + sol.isPowerOfThree(n1));
        System.out.println(n2 + " is power of three: " + sol.isPowerOfThree(n2));
        System.out.println(n3 + " is power of three: " + sol.isPowerOfThree(n3));
    }
}

