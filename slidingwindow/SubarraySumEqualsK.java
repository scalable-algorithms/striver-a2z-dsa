package striver_a2z_dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = { 0, 0 };
        int k = 0;
        System.out.println(subarraySum(nums, k));
    }

    private static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        int totalSum = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            if (freq.containsKey(totalSum - k)) {
                ans += freq.get(totalSum - k);
            }
            freq.put(totalSum, freq.getOrDefault(freq.get(totalSum), 0) + 1);
        }
        return ans;
    }

}
