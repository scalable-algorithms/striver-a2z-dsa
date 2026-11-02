package striver_a2z_dsa.bitwise.basic;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        List<Integer> list = new LinkedList<>();
        list.clear();
        list.is
        System.out.println(longestOnes(nums, k));
    }

    private static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        if (k == n) {
            return n;
        }
        int maxLen = 0;
        int flips = k;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0 && flips >= k) {
                while (flips >= k) {
                    if (nums[i] == 0) {
                        flips--;
                    }
                    i++;
                }
            }
            if (nums[j] == 0 && flips <= k) {
                flips++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}
