package striver_a2z_dsa.strings.easy;

public class RotateString {

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }

    // solution 2
    private static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    // solution 1
    // private static boolean rotateString(String s, String goal) {
    //     char[] str = s.toCharArray();
    //     for (int i = 0; i < s.length(); i++) {
    //         if (Arrays.equals(str, goal.toCharArray())) {
    //             return true;
    //         }
    //         rotateByOne(str);
    //     }
    //     return false;
    // }

    // private static void rotateByOne(char[] s) {
    //     if (s.length == 0) {
    //         return;
    //     }
    //     char f = s[0];
    //     for (int i = 0; i < s.length - 1; i++) {
    //         s[i] = s[i + 1];
    //     }
    //     s[s.length - 1] = f;
    // }

}
