package binarysearch.easy;

public class UpperBound {

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 9, 15, 19};
        int x = 9;
        System.out.println("upper bound : " + upperBound(nums, x));
    }

    private static int upperBound(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] > x) {
                ans = middle;
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return ans;
    }
}
