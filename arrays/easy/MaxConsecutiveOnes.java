package arrays.easy;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int result = getMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

    // private static int getMaxConsecutiveOnes(int[] nums) {
    //     int maxConsecutives = 0;
    //     int consecutives = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == 1) {
    //             consecutives++;
    //             maxConsecutives = Math.max(maxConsecutives, consecutives);
    //         } else {
    //             consecutives = 0;
    //         }
    //     }
    //     return maxConsecutives;
    // }

    // solution 2 : using two pointers
    private static int getMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int ans = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                ans = Math.max(ans, right - left);
                while (right < nums.length && nums[right] == 0) {
                    right++;
                }
                left = right;
            } else {
                right++;
            }

        }

        return Math.max(ans, right - left);
    }

}