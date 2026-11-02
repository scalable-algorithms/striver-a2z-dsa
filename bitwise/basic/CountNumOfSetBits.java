package striver_a2z_dsa.bitwise.basic;

public class CountNumOfSetBits {
    public static void main(String[] args) {
        int n = 103;
        System.out.println(countSetBits(n));
    }

    /**
    * Brian Kernighan's Algorithm
    *
    * The expression (n & (n - 1)) removes the rightmost set bit (1)
    * from the binary representation of n.
    *
    * Example:
    * n = 12 (1100)
    *
    * n      = 1100
    * n - 1  = 1011
    * ----------------
    * n&(n-1)= 1000
    *
    * The rightmost set bit is removed.
    *
    * Since each iteration removes exactly one set bit, the loop
    * runs only as many times as there are set bits in the number.
    *
    * Example:
    * 103 (1100111)
    * -> 1100110
    * -> 1100100
    * -> 1100000
    * -> 1000000
    * -> 0000000
    *
    * Number of iterations = Number of set bits = 5
    *
    * Time Complexity: O(number of set bits)
    * Space Complexity: O(1)
    */
    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    /**
    * Counts the number of set bits (1s) in the binary representation of a number.
    *
    * Approach:
    * 1. Check the least significant bit (LSB) using (n & 1).
    *    - If the result is 1, the current bit is set, so increment count.
    * 2. Right shift the number by one position (n >>= 1)
    *    to process the next bit.
    * 3. Repeat until the number becomes 0.
    *
    * Example:
    * n = 103 -> 1100111
    *
    * Iteration:
    * 1100111 -> bit = 1 -> count = 1
    * 0110011 -> bit = 1 -> count = 2
    * 0011001 -> bit = 1 -> count = 3
    * 0001100 -> bit = 0 -> count = 3
    * 0000110 -> bit = 0 -> count = 3
    * 0000011 -> bit = 1 -> count = 4
    * 0000001 -> bit = 1 -> count = 5
    *
    * Result = 5
    *
    * Time Complexity: O(log n)
    * Space Complexity: O(1)
    */
    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }
}
