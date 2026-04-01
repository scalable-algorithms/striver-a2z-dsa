package arrays.easy;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 34, -102, 9, 23, 12, -321, -543};
        int largestElement = getLargestElementFromArr(arr);
        System.out.println(largestElement);
    }

    // private static int getLargestElementFromArr(int[] arr) {
    //     int largestElement = arr[0];
    //     for(int i : arr) {
    //         if (i > largestElement) {
    //             largestElement = i;
    //         }
    //     }
    //     return largestElement;
    // }

    private static int getLargestElementFromArr(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
