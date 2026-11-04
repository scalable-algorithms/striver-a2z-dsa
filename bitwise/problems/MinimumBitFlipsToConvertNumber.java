package striver_a2z_dsa.bitwise.problems;

public class MinimumBitFlipsToConvertNumber {

    public static void main(String[] args) {
        int start = 3;
        int goal = 4;
        System.out.println(minBitFlips(start, goal));
    }

    /**
    * Bit-by-bit Traversal using Right Shift and AND
    *
    * The XOR operation (start ^ goal) identifies the bit positions
    * where start and goal have different bits.
    *
    * Example:
    * start = 10 (1010)
    * goal  = 7  (0111)
    *
    * start ^ goal = 1101
    *
    * The expression (result & 1) checks the rightmost bit.
    * If the rightmost bit is 1, increment the flip counter.
    *
    * The expression (result >> 1) shifts all bits one position
    * to the right, allowing us to check the next bit.
    *
    * Example:
    * result = 13 (1101)
    *
    * 1101 -> 110
    *  110 -> 11
    *   11 -> 1
    *    1 -> 0
    *
    * Number of iterations = Number of bits in result
    *
    * Time Complexity: O(log n)
    * - Each iteration shifts the number right by one position.
    * - Right shifting by one is equivalent to dividing by 2.
    * - Therefore, the number of iterations is approximately
    *   log2(n), where n is the XOR result.
    * - Hence, Time Complexity = O(log n).
    *
    * Space Complexity: O(1)
    * - Only a constant number of variables are used.
    * - No additional data structures are created.
    */
    public int minBitFlips(int start, int goal) {
        int result = start ^ goal;
        int minFlips = 0;

        while (result > 0) {
            if ((result & 1) == 1) {
                minFlips++;
            }
            result >>= 1;
        }

        return minFlips;
    }

    /**
    * Brian Kernighan's Algorithm
    *
    * The XOR operation (start ^ goal) identifies the bit positions
    * where start and goal have different bits.
    *
    * Example:
    * start = 10 (1010)
    * goal  = 7  (0111)
    *
    * start ^ goal = 1101
    *
    * The expression (result & (result - 1)) removes the rightmost
    * set bit (1) from the binary representation of result.
    *
    * Example:
    * result = 13 (1101)
    *
    * result     = 1101
    * result - 1 = 1100
    * -----------------
    * result & (result - 1) = 1100
    *
    * The rightmost set bit is removed.
    *
    * Since each iteration removes exactly one set bit, the loop
    * runs only as many times as there are set bits in result.
    *
    * Example:
    * 13 (1101)
    * -> 1100
    * -> 1000
    * -> 0000
    *
    * Number of iterations = Number of set bits = 3
    *
    * Time Complexity: O(k), where k is the number of set bits.
    * - Each iteration removes exactly one set bit.
    * - If the number contains k set bits, the loop executes
    *   exactly k times.
    * - Therefore, Time Complexity = O(k).
    * - In the worst case, all bits are set, so k can be
    *   log2(n) + 1.
    * - Hence, worst-case Time Complexity = O(log n).
    *
    * Space Complexity: O(1)
    * - Only a constant number of variables are used.
    * - No additional data structures are created.
    */
    // public int minBitFlips(int start, int goal) {
    //     int result = start ^ goal;
    //     int minFlips = 0;

    //     while (result > 0) {
    //         result = result & (result - 1);
    //         minFlips++;
    //     }

    //     return minFlips;
    // }
}