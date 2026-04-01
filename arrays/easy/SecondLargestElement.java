package arrays.easy;

public class SecondLargestElement {

    public static void main(String[] args) {
        // int[] arr = { 3, 1, 0, -321, 23, 10, 6 };
        int[] arr = { -10, -20, -30 };
        int secondLargestElement = getSecondLargestElement(arr);
        System.out.println(secondLargestElement);
    }

    private static int getSecondLargestElement(int[] arr) {
        int firstLargestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstLargestElement) {
                secondLargestElement = firstLargestElement;
                firstLargestElement = num;
            } else if (num > secondLargestElement && num != firstLargestElement) {
                secondLargestElement = num;
            }
        }
        return secondLargestElement;
    }
}
