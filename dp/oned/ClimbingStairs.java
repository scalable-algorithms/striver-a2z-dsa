package striver_a2z_dsa.dp.oned;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(climbStairs(n));
    }

    // solution 2 
    private static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int prevTwo = 2;
        int prevOne = 1;
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = prevTwo + prevOne;
            prevOne = prevTwo;
            prevTwo = current;
        }
        return current;
    }

    // solution 1
    // private static int climbStairs(int n) {
    //     int[] dp = new int[n + 1];
    //     return solve(n, dp);
    // }

    // private static int solve(int n, int[] dp) {
    //     if (n <= 2) {
    //         return n;
    //     }
    //     if (dp[n] != 0) {
    //         return dp[n];
    //     }
    //     dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
    //     return dp[n];
    // }
}
