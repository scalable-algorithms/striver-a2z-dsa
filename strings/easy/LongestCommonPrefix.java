package striver_a2z_dsa.strings.easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

    // solution 3 
    private static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    // solution 2
    // private static String longestCommonPrefix(String[] strs) {
    //     Arrays.sort(strs);
    //     StringBuilder ans = new StringBuilder();
    //     int i = 0;
    //     int j = 0;
    //     String first = strs[0];
    //     String last = strs[strs.length - 1];
    //     while (i < first.length() && j < last.length()) {
    //         char f = first.charAt(i);
    //         char l = last.charAt(j);
    //         if (f == l) {
    //             ans.append(f);
    //             i++;
    //             j++;
    //         } else {
    //             break;
    //         }
    //     }
    //     return ans.toString();
    // }

    // solution 1
    // private static String longestCommonPrefix(String[] strs) {
    //     String str = strs[0];
    //     StringBuilder ans = new StringBuilder();
    //     for (int i = 0; i < str.length(); i++) {
    //         if (isCommon(strs, i)) {
    //             ans.append(str.charAt(i));
    //         } else {
    //             break;
    //         }
    //     }
    //     return ans.toString();
    // }

    // private static boolean isCommon(String[] strs, int i) {
    //     char c = strs[0].charAt(i);
    //     for (String str : strs) {
    //         if (i > str.length() - 1 || str.charAt(i) != c) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

}
