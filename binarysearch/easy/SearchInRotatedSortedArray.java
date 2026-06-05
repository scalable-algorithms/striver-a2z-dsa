package binarysearch.easy;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    // solution 1
    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] <= nums[right]) {
            return binarySearch(nums, left, right, target);
        }
        int pivot = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        pivot = left;
        if (target < nums[0]) {
            return binarySearch(nums, pivot, nums.length - 1, target);
        }
        return binarySearch(nums, 0, pivot - 1, target);
    }

    private static int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
