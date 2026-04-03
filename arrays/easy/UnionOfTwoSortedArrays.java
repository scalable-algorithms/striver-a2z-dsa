package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        // int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int[] arr2 = { 2, 3, 4, 4, 5, 11, 12 };
        int[] arr1 = { 2, 2, 10, 100 };
        int[] arr2 = { -10, 20, 30, 40 };
        List<Integer> result = unionTwoArrays(arr1, arr2);
        System.out.println(result);
    }

    private static List<Integer> unionTwoArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        List<Integer> union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else if (arr1[i] == arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i++]);
            }
        }
        while (j < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j++]);
            }
        }
        return union;
    }

}