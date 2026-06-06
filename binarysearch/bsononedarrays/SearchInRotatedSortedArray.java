package striver_a2z_dsa.binarysearch.bsononedarrays;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        // int[] nums = {4, 5, 6, 7, 0, 1, 2};
        // int target = 0;
        int[] nums = {4, 5, 6, -1, 0, 1, 2};
        int target = 5;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {  //left half is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // solution 1
    // private static int search(int[] nums, int target) {
    //     int left = 0;
    //     int right = nums.length - 1;
    //     if (nums[left] <= nums[right]) {
    //         return binarySearch(nums, left, right, target);
    //     }
    //     int pivot = 0;
    //     while (left < right) {
    //         int mid = left + (right - left) / 2;
    //         if (nums[mid] > nums[right]) {
    //             left = mid + 1;
    //         } else {
    //             right = mid;
    //         }
    //     }
    //     pivot = left;
    //     if (target < nums[0]) {
    //         return binarySearch(nums, pivot, nums.length - 1, target);
    //     }
    //     return binarySearch(nums, 0, pivot - 1, target);
    // }
    // private static int binarySearch(int[] nums, int left, int right, int target) {
    //     while (left <= right) {
    //         int middle = left + (right - left) / 2;
    //         if (nums[middle] == target) {
    //             return middle;
    //         } else if (nums[middle] < target) {
    //             left = middle + 1;
    //         } else {
    //             right = middle - 1;
    //         }
    //     }
    //     return -1;
    // }
}
