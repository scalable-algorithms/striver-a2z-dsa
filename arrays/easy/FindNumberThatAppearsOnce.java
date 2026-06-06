package striver_a2z_dsa.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class FindNumberThatAppearsOnce {
    
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }

    // Solution 1 : using XOR
    // a ^ a = 0 and a ^ 0 = a;
    private static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans ^= i;
        }
        return ans;
    }

    // solution 2 : using frequency map
    // private static int singleNumber(int[] nums) {
    //      Map<Integer, Integer> frequencies = new HashMap<>();
    //     for (int i : nums) {
    //         frequencies.put(i, frequencies.getOrDefault(i, 0) + 1);
    //     }

    //     for (int key : frequencies.keySet()) {
    //         if (frequencies.get(key) == 1) {
    //             return key;
    //         }
    //     }
    //     return -1;
    // }

    // private static int singleNumber(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         int num = nums[i];
    //         int count = 0;
    //         for (int j = 0; j < nums.length; j++) {
    //             if (count > 1) {
    //                 break;
    //             }
    //             if (nums[j] == num) {
    //                 count++;
    //             }
    //         }
    //         if (count == 1) {
    //             return num;
    //         }
    //     }

    //     return -1;
    // }

}
