package striver_a2z_dsa.bitwise.problems;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        System.out.println(singleNumber(nums));
    }

    /**
    * XOR Approach
    *
    * XOR properties:
    *
    * 1. a ^ a = 0
    *    XOR of the same numbers results in 0.
    *
    * 2. a ^ 0 = a
    *    XOR with 0 keeps the original number unchanged.
    *
    * 3. a ^ b = b ^ a
    *    XOR is commutative, so the order does not matter.
    *
    * 4. (a ^ b) ^ c = a ^ (b ^ c)
    *    XOR is associative, so we can change the grouping.
    *
    * The problem states that every element appears twice except
    * for one element.
    *
    * By XORing all elements, duplicate numbers cancel each other
    * because a ^ a = 0.
    *
    * Example:
    * nums = [4, 1, 2, 1, 2]
    *
    * result = 0
    *
    * result = 0 ^ 4 = 4
    * result = 4 ^ 1 = 5
    * result = 5 ^ 2 = 7
    * result = 7 ^ 1 = 6
    * result = 6 ^ 2 = 4
    *
    * Final result = 4
    *
    * All duplicate elements cancel each other, leaving only
    * the element that appears once.
    *
    * Time Complexity: O(n)
    * - The for loop iterates through all n elements in the array.
    * - Each iteration performs one XOR operation, which takes O(1).
    * - Therefore, total time complexity = n * O(1) = O(n).
    *
    * Space Complexity: O(1)
    * - Only one variable (result) is used to store the XOR result.
    * - No additional arrays or data structures are created.
    * - Therefore, Space Complexity = O(1).
    */
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
