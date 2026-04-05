package arrays.easy;

public class CheckIfArrayIsSortedAndRotated {

    public static void main(String[] args) {
        // int[] nums = { 3, 4, 5, 1, 2 };
        // int[] nums = {1, 2, 3, 4, 5};
        int[] nums = { 2, 1, 3, 4 };
        boolean ans = check(nums);
        System.out.println(ans);
    }

    // solution 3
    public static boolean check(int[] nums) {
        // int[] nums = {3, ,4, 5, 1, 2};
        int violations = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                violations++;
            }
        }
        return violations <= 1;
    }

    // solution 2 
    // space complexity : we taken extra space (doubled) : arr + arr = n + n = 2n, final : n
    //time complexity : O(n^2) : for each i in nums, again we iterate all the elements
    //     public static boolean check(int[] nums) {
    //     int[] doubledNums = doubleArr(nums);
    //     int n = nums.length;
    //     for (int start = 0; start < n; start++) {
    //         if (isArraySorted(doubledNums, start, start + n - 1)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // private static boolean isArraySorted(int[] arr, int start, int end) {
    //     for (int i = start + 1; i <= end; i++) {
    //         if (arr[i] < arr[i - 1]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // private static int[] doubleArr(int[] arr) {
    //     int n = arr.length;
    //     int[] doubledArr = new int[n * 2];
    //     for (int i = 0; i < n; i++) {
    //         doubledArr[i] = arr[i];
    //         doubledArr[i + n] = arr[i];
    //     }
    //     return doubledArr;
    // }

    // //solution 1
    // // time complexity : O(n^2)
    // // because we are rotating the array n times and each time we are checking if the array is sorted or not which takes O(n) time
    // // and insdie the rotation again we are iterating n elements in the array so n * n tc.
    // public static boolean check(int[] nums) {
    //     for (int i = 0; i <= nums.length; i++) {
    //         if (isArraySorted(nums)) {
    //             return true;
    //         }
    //         nums = rotateArray(nums, 1);    //rotate array by 1 element upto n steps 
    //     }
    //     return false;
    // }

    // private static boolean isArraySorted(int[] arr) {
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] < arr[i - 1]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // private static int[] rotateArray(int[] arr, int positions) {
    //     int n = arr.length;
    //     arr = swapArray(arr, 0, n - positions - 1);
    //     arr = swapArray(arr, n - positions, n - 1);
    //     return swapArray(arr, 0, n - 1);
    // }

    // private static int[] swapArray(int[] arr, int start, int end) {
    //     while (start < end && start >= 0 && end < arr.length) {
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    //     return arr;
    // }
}