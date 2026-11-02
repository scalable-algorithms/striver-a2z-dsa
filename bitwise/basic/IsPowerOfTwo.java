package striver_a2z_dsa.bitwise.basic;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }

    /**
    * LeetCode 231 - Power of Two
    *
    * Formula:
    * n > 0 && (n & (n - 1)) == 0
    *
    * Explanation:
    * 1. A power of 2 always contains exactly one set bit.
    *
    * Examples:
    * 1  = 0001
    * 2  = 0010
    * 4  = 0100
    * 8  = 1000
    * 16 = 10000
    *
    * 2. When we subtract 1 from a power of 2:
    *
    * 8      = 1000
    * 8 - 1  = 0111
    *
    * 3. ANDing them always produces 0:
    *
    * 1000
    * 0111
    * ----
    * 0000
    *
    * 4. For numbers that are NOT powers of 2:
    *
    * 10     = 1010
    * 10 - 1 = 1001
    *
    * 1010
    * 1001
    * ----
    * 1000
    *
    * Result is not 0, therefore 10 is not a power of 2.
    *
    * Why it works:
    * - n - 1 turns the rightmost set bit into 0.
    * - All bits to its right become 1.
    * - If n had only one set bit, all bits become 0 after AND.
    * - Otherwise some set bit remains.
    */
    private static boolean isPowerOfTwo(int n) {
        return n != 0 && (n & (n - 1)) == 0;
    }

    // private static boolean isPowerOfTwo(int n) {
    //     if (n <= 0) {
    //         return false;
    //     }
    //     long sum = 1;
    //     while (sum <= n) {
    //         if (sum == n) {
    //             return true;
    //         }
    //         sum *= 2;
    //     }
    //     return false;
    // }
}
