package striver_a2z_dsa.arrays.easy;

import java.util.Arrays;

public class RotateArrayByKEitherLeftOrRight {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        boolean isLeft = true;
       nums =  rotateArrayByK(nums, k, isLeft);
       System.out.println(Arrays.toString(nums));
    }

    private static int[] rotateArrayByK(int[] arr, int k, boolean isLeft) {
        k = k % arr.length;
        if (isLeft) {
            return rotateLeft(arr, k);
        } else {
            return rotateRight(arr, k);
        }
    }

    private static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        arr = reverseArray(arr, n - k, n - 1);
        arr = reverseArray(arr, 0, n - k - 1);
        arr = reverseArray(arr, 0, n - 1);
        return arr;
    }

    private static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;
        arr = reverseArray(arr, 0, k - 1);
        arr = reverseArray(arr, k, n - 1);
        arr = reverseArray(arr, 0, n - 1);
        return arr;
    }

    private static int[] reverseArray(int[] arr, int start, int end) {
        int n = arr.length;
        while (start < end && start >= 0 && end < n) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

}