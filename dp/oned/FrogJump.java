package striver_a2z_dsa.dp.oned;

public class FrogJump {
    public static void main(String[] args) {
        // int[] heights = { 2, 1, 3, 5, 4 };
        // int[] heights = { 7, 5, 1, 2, 6 };
        int[] heights = { 10, 30, 40, 20, 50 };
        System.out.println(minEnergy(heights));
    }

    private static int minEnergy(int[] heights) {
        int n = heights.length;
        int minEnergyConsumed = 0;
        int i = 0;
        while (i < n - 1) {
            int first = Math.abs(heights[i] - heights[i + 1]);
            int second = -1;
            if (i + 2 < n) {
                second = Math.abs(heights[i] - heights[i + 2]);
            }
            if (second == -1) {
                minEnergyConsumed += first;
                break;
            }
            if (first < second) {
                i = i + 1;
                minEnergyConsumed += first;
            } else {
                i = i + 2;
                minEnergyConsumed += second;
            }
        }
        return minEnergyConsumed;
    }
}
