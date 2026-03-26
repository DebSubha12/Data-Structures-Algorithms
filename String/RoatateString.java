package String;

import java.util.Scanner;

public class RoatateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String(S)");
        String s = sc.nextLine();
        System.out.print("Enter Second String(goal)");
        String goal = sc.nextLine();
        // Create object of class
        RoatateString obj = new RoatateString();
        // Call method and store result
        boolean result = obj.rotateString(s, goal);
        // Print result
        System.out.println("Result: " + result);
        sc.close();
    }
}
