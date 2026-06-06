package striver_a2z_dsa.binarysearch.bsononedarrays;

public class SearchInRotatedSortedArrayTwo {

    public static void main(String[] args) {
        // int[] nums = {1,0,1,1,1};
        // int target = 0;
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    /**
     * Time Complexity : 
     * best/average is O(logn)
     * worst O(n) : [1,1,1,1,0,1,1,1] we do shrink 
     */
    private static boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] == nums[low]) {
                low++;
            } else if (nums[mid] == nums[low] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
