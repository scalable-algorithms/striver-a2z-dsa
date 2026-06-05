package binarysearch.easy;

import java.util.Arrays;

public class FloorAndCeilInSortedArray {

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;
        System.out.println(Arrays.toString(getFloorAndCeil(nums, x)));
    }

    private static int[] getFloorAndCeil(int[] nums, int x) {
        int floor = getFloor(nums, x);
        int ceil = getCeil(nums, x);
        return new int[]{floor, ceil};
    }

    private static int getFloor(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] <= x) {
                ans = nums[middle];
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return ans;
    }

    private static int getCeil(int[] nums, int x) {
        int start = 0;
        int end = nums.length;
        int ans = 0;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] >= x) {
                ans = nums[middle];
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return ans;
    }
}
