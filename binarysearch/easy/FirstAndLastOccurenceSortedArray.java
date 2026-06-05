package binarysearch.easy;

import java.util.Arrays;

public class FirstAndLastOccurenceSortedArray {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int first = getFirstOccurence(nums, target);
        int last = getLastOccurence(nums, target);
        return new int[]{first, last};
    }

    private static int getFirstOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int midVal = nums[middle];
            if (midVal == target) {
                ans = middle;
                end = middle - 1;
            } else if (midVal < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return ans;
    }

    private static int getLastOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int midVal = nums[middle];
            if (midVal == target) {
                ans = middle;
                start = start + 1;
            } else if (midVal < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return ans;
    }
}
