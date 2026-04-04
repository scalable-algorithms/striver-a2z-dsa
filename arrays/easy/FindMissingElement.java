package arrays.easy;

public class FindMissingElement {

    public static void main(String[] args) {
        int[] nums = { 8, 2, 4, 5, 3, 7, 1 };
        int missingElement = findMissingElement(nums);
        System.out.println(missingElement);
    }

    
    // Solution 3 : using XOR operator
    private static int findMissingElement(int[] nums) {
        int n = nums.length + 1;
        int xorOne = 0;
        int xorTwo = 0;
        for (int i = 0; i < n - 1; i++) {
            xorOne ^= nums[i];
        }

        for (int i = 1; i <= n; i++) {
            xorTwo ^= i;
        }
        return xorOne ^ xorTwo;
    }


    //solution 2 store frequency of every element 
    // if any number having frequency of 0 then return it
    // private static int findMissingElement(int[] nums) {
    //     int n = nums.length + 1;
    //     int[] frequency = new int[n + 1];
    //     for (int i = 0; i < nums.length; i++) {
    //         frequency[nums[i]]++;
    //     }
    //     for (int i = 1; i < frequency.length; i++) {
    //         if (frequency[i] == 0) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // Solution 1 : using sum of all numbers formula
    // nums having numbers from 1 to n
    // private static int findMissingElement(int[] nums) {
    //     int n = nums.length + 1; // because 1 element is missing, so n + 1
    //     int expectedSum = n * (n + 1) / 2;
    //     int sum = 0;
    //     for (int i : nums) {
    //         sum += i;
    //     }
    //     return expectedSum - sum;
    // }

}
