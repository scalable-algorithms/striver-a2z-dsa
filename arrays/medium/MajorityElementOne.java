package arrays.medium;

public class MajorityElementOne {

    public static void main(String[] args) {
        int[] nums = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        // output = 7;
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                count++;
            } else if (nums[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
