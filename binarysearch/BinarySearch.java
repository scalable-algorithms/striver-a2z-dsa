package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    /**
     * Binary Search Time Complexity: O(log N)
     *
     * Suppose array size = n
     *
     * After 1st iteration, remaining elements = n/2 After 2nd iteration,
     * remaining elements = n/4 After 3rd iteration, remaining elements = n/8
     * ... After k iterations, remaining elements = n/2^k
     *
     * Search stops when only 1 element remains: n/2^k = 1
     *
     * Multiply both sides by 2^k: n = 2^k
     *
     * Taking log₂ on both sides: log₂(n) = k
     *
     * Therefore, total iterations = log₂(n) Time Complexity = O(log N)
     */
    private static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target == nums[middle]) {
                return middle;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
