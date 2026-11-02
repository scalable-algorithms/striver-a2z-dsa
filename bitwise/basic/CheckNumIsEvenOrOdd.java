package striver_a2z_dsa.bitwise.basic;

public class CheckNumIsEvenOrOdd {

    public static void main(String[] args) {
        int n = 20;
        System.out.println(isEven(n));
    }

    /**
    * Method 1: Using AND (&) - Preferred Bit Manipulation Approach
    *
    * Formula:
    * (n & 1) != 0
    *
    * Explanation:
    * 1. The last bit (LSB) determines whether a number is odd or even.
    * 2. Odd numbers always have LSB = 1.
    * 3. Even numbers always have LSB = 0.
    * 4. AND with 1 extracts only the last bit.
    * 5. If result is 1, the number is odd.
    * 6. If result is 0, the number is even.
    *
    * Example:
    * n = 13 -> 1101
    *
    * 1101
    * 0001
    * ----
    * 0001
    *
    * Result = 1, therefore 13 is odd.
    */
    private static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    /**
    * Method 2: Using Modulus (%)
    *
    * Formula:
    * n % 2 != 0
    *
    * Explanation:
    * 1. Odd numbers leave remainder 1 when divided by 2.
    * 2. Even numbers leave remainder 0 when divided by 2.
    *
    * Example:
    * n = 13
    *
    * 13 % 2 = 1
    *
    * Result = 1, therefore 13 is odd.
    */
    private static boolean isEven(int n) {
        return (n % 2) == 0;
    }
}
