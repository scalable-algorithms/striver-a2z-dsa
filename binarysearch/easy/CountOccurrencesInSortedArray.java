package binarysearch.easy;

public class CountOccurrencesInSortedArray {

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 3, 3, 4};
        int target = 3;
        int count = (getLastOccurence(nums, target) - getFirstOccurence(nums, target)) + 1;
        System.out.println(count);
    }

    /**
     *
     * Time Complexity: O(log N) We perform Binary Search twice: 1. Find First
     * Occurrence -> O(log N) 2. Find Last Occurrence -> O(log N)
     *
     * Total Time Complexity: O(log N) + O(log N) = 2 * O(log N) = O(log N)
     */
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
        return (ans == -1) ? 0 : ans;
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
        return (ans == -1) ? 0 : ans;
    }

}
