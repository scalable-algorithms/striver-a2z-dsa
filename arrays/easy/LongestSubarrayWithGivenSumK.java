package striver_a2z_dsa.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithGivenSumK {

    public static void main(String[] args) {
        // int[] arr = { 1, -1, 5, -2, 3 };
        // int[] arr = { 10, 5, 2, 7, 1, 9 };
        // int[] arr = {2, 0, 0, 3};
        int[] arr = { 9, -3, 3, -1, 6, -5 };
        int k = 0;
        int longestSubarrayLength = getLongestSubarrayLength(arr, k);
        System.out.println(longestSubarrayLength);
    }

    // solution 3 : using prefix sum and hash map
    // time complexity : O(N) because we are traversing array n elements only once
    // hashMap operations are O(1)
    // in the worst case O(N^2) when hash collisions occurs
    // space complexity will be O(n)
    private static int getLongestSubarrayLength(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }
            int remaining = sum - k;

            if (map.containsKey(remaining)) {
                int length = i - map.get(remaining);
                maxLength = Math.max(maxLength, length);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    // solution 2 : using sliding window
    // only works with positive numbers
    // private static int getLongestSubarrayLength(int[] arr, int k) {
    //     int n = arr.length;
    //     int maxLength = 0;
    //     int i = 0;
    //     int sum = 0;
    //     for (int j = 0; j < n; j++) {
    //         sum += arr[j];

    //         while (i <= j && sum > k) {
    //             sum -= arr[i];
    //             i++;
    //         }

    //         if (sum == k) {
    //             maxLength = Math.max(maxLength, j - i + 1);
    //         }
    //     }
    //     return maxLength;
    // }

    // solution 1 : using brute force
    // time complexity : O(n^2)

    // outer loop : runs n times

    // inner loop :
    // For i = 0 → n times  
    // For i = 1 → n-1 times  
    // For i = 2 → n-2 times  
    // ...
    // For i = n-1 → 1 time  

    // total iterations :
    // n + (n-1) + (n-2) + ... + 1  

    // formula :
    // n(n+1)/2   → sum of first n natural numbers  

    // hence :
    // O(n^2)
    // space complexity : O(1) because we are not taking any extra space
    // private static int getLongestSubarrayLength(int[] arr, int k) {
    //     int n = arr.length;
    //     int longestSubArrayLength = 0;
    //     for (int i = 0; i < n; i++) {
    //         int sum = 0;
    //         for (int j = i; j < n; j++) {
    //             sum += arr[j];
    //             if (sum == k) {
    //                 longestSubArrayLength = Math.max(longestSubArrayLength, j - i + 1);
    //             }
    //         }
    //     }
    //     return longestSubArrayLength;
    // }

}