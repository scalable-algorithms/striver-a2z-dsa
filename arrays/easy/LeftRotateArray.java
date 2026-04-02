package arrays.easy;

import java.util.Arrays;

public class LeftRotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateByOne(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static int[] leftRotateByOne(int[] arr) {
        int zeroElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = zeroElement;
        return arr;
    }

}