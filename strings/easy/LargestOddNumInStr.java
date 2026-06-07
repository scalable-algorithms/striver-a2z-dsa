package striver_a2z_dsa.strings.easy;

public class LargestOddNumInStr {

    public static void main(String[] args) {
        String num = "34524";
        System.out.println(largestOddNumber(num));
    }

    private static String largestOddNumber(String num) {
        int start = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(start, i + 1);
            }
        }
        return "";
    }

}
