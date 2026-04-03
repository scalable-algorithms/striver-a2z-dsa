package arrays.easy;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 3, 0, 4, 0, 1 };
        nums = moveZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] moveZerosToEnd(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return arr;
        }
        int i = 0;
        int j = 0;
        while (j < n) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return arr;
    }

}