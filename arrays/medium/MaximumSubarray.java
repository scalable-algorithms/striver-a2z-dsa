package striver_a2z_dsa.arrays.medium;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // output 6
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int curSum = nums[i] + sum;
            max = Math.max(max, curSum);
            if (curSum > 0) {
                sum = curSum;
            } else {
                sum = 0;
            }

        }
        return max;
    }

}
