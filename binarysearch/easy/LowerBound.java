package binarysearch.easy;

public class LowerBound {

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 15, 19};
        int x = 9;
        System.out.println(lowerBound(nums, x));
    }

    private static int lowerBound(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] >= x) {
                ans = middle;
                end = middle - 1;
            } else if (nums[middle] < x) {
                start = middle + 1;
            }
        }
        return ans;
    }
}
