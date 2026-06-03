package arrays.medium;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return;
        }

        int start = 0;
        int middle = 0;
        int end = n - 1;
        while (middle <= end) {
            if (nums[middle] == 0) {
                swap(nums, start, middle);
                start++;
                middle++;
            } else if (nums[middle] == 1) {
                middle++;
            } else {
                swap(nums, middle, end);
                end--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
