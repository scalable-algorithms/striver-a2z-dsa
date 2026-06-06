package striver_a2z_dsa.arrays.medium;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsVsIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (numsVsIndex.containsKey(rem)) {
                return new int[] { numsVsIndex.get(rem), i };
            }
            numsVsIndex.put(nums[i], i);
        }
        return new int[] {};
    }

}