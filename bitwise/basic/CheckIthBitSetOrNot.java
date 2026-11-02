package striver_a2z_dsa.bitwise.basic;

public class CheckIthBitSetOrNot {

    public static void main(String[] args) {
        int n = 5, i = 0;
        System.out.println(isSetBit(n, i));
    }

    /**
    * Method 1: Using AND (&)
    *
    * Formula:
    * (n & (1 << i)) != 0
    *
    * Explanation:
    * 1. Create a mask with only the i-th bit set using (1 << i).
    * 2. Perform AND between n and the mask.
    * 3. If the result is non-zero, the i-th bit in n is set (1).
    * 4. If the result is zero, the i-th bit in n is not set (0).
    *
    * Note : 1 << i -> makes a musk where all bits are 0 expect that ith bit and we do & n.
    * Example:
    * n = 13 -> 1101
    * i = 2
    *
    * mask = 1 << 2 = 0100
    *
    * 1101
    * 0100
    * ----
    * 0100 (non-zero)
    *
    * Therefore, bit 2 is set.
    */
    // private static boolean isSetBit(int n, int i) {
    //     return (n & (1 << i)) != 0;
    // }

    /**
    * Method 2: Using Right Shift (>>)
    *
    * Formula:
    * ((n >> i) & 1) == 1
    *
    * Explanation:
    * 1. Right shift n by i positions so that the i-th bit moves to position 0.
    * 2. AND the result with 1.
    * 3. If the result is 1, the i-th bit was set.
    * 4. If the result is 0, the i-th bit was not set.
    *
    * Note :  here n >> i -> that ith bit moves at the end and we do & 1 so it check that last bit is 1 or 0
    * Example:
    * n = 13 -> 1101
    * i = 2
    *
    * 1101 >> 2 = 0011
    *
    * 0011
    * 0001
    * ----
    * 0001
    *
    * Therefore, bit 2 is set.
    */
    private static boolean isSetBit(int n, int i) {
        return ((n >> i) & 1) != 0;
    }
}

/**
 * Check if the i-th bit is set or not
 * Problem Statement: Given two integers n and i, return true if the ith bit in the binary representation of n 
 * (counting from the least significant bit, 0-indexed) is set (i.e., equal to 1). Otherwise, return false.
 * 
 * Example 1:
Input: 
n = 5, i = 0
Output: 
true
Explanation: 
Binary representation of 5 is 101. The 0-th bit from LSB is set (1).

Example 2:
Input: 
n = 10, i = 1
Output: 
true
Explanation: 
Binary representation of 10 is 1010. The 1-st bit from LSB is set (1).
 */