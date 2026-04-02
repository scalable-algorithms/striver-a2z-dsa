package arrays.easy;

public class RemoveDuplicatesFromSortedArray {
    Solution solution = new Solution();
    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3 };
    int ans = solution.removeDuplicates(nums);
}

// solution 1
// time complexity is O(n) : we only traverse the array once 
//space complexity is O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int i = 1;
        int j = i;
        while (j < n) {
            if (nums[j] != nums[j - 1]) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }
        return i;
    }
}