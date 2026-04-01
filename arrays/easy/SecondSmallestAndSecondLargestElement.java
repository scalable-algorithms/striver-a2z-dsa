package arrays.easy;

public class SecondSmallestAndSecondLargestElement {

    public static void main(String[] args) {
        int[] arr = { 2, 0, -10, -20, 23 };

        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        int smallestElement = Integer.MAX_VALUE;
        int secondSmallestElement = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > largestElement) {
                secondLargestElement = largestElement;
                largestElement = num;
            } else if (num > secondLargestElement && num != largestElement) {
                secondLargestElement = num;
            }

            if (num < smallestElement) {
                secondSmallestElement = smallestElement;
                smallestElement = num;
            } else if (num < secondSmallestElement && num != smallestElement) {
                secondSmallestElement = num;
            }
        }
        System.out.println();
    }

/**
 * Time complexity : O(n)
 * input size = n
 * 
 */

    // public static void main(String[] args) {
    //     int[] arr = { 2, 0, -10, -20, 23 };

    //     int largestElement = Integer.MIN_VALUE;
    //     int secondLargestElement = Integer.MIN_VALUE;

    //     int smallestElement = Integer.MAX_VALUE;
    //     int secondSmallestElement = Integer.MAX_VALUE;

    //     for (int num : arr) {
    //         if (num > largestElement) {
    //             largestElement = num;
    //         }
    //         if (num < smallestElement) {
    //             smallestElement = num;
    //         }
    //     }

    //     for (int num : arr) {
    //         if (num > secondLargestElement && num != largestElement) {
    //             secondLargestElement = num;
    //         }
    //         if (num < secondSmallestElement && num != smallestElement) {
    //             secondSmallestElement = num;
    //         }
    //     }
    // }

}
