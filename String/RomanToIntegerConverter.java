<<<<<<< HEAD
package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToIntegerConverter {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 &&
                current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        int result = romanToInt(roman);

        System.out.println("Integer value: " + result);

        sc.close();
    }
}
=======
package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToIntegerConverter {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 &&
                current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        int result = romanToInt(roman);

        System.out.println("Integer value: " + result);

        sc.close();
    }
}
>>>>>>> 775d387 (Save All Changes)
