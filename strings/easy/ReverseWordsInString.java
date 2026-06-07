package striver_a2z_dsa.strings.easy;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "the sky is blue";
        // String s = "  a good   example";
        System.out.println(reverseWords(s));
    }

    // solution 2
    private static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String word = "";
        s = s.trim();
        char[] strArr = s.toCharArray();
        for (int i = strArr.length - 1; i >= 0;) {
            if (strArr[i] == ' ') {
                ans.append(reverseString(word)).append(' ');
                while (strArr[i] == ' ')
                    i--;
                word = "";
            } else {
                word += "" + strArr[i];
                i--;
            }
        }
        ans.append(reverseString(word));
        return ans.toString();
    }

    private static String reverseString(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] word = s.toCharArray();
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }

    // solution 1
    // private static String reverseWords(String s) {
    //     StringBuilder ans = new StringBuilder();
    //     s = s.trim();
    //     int end = s.length() - 1;
    //     int i = end;
    //     for (; i >= 0; i--) {
    //         if (s.charAt(i) == ' ') {
    //             ans.append(s.substring(i + 1, end + 1)).append(' ');
    //             while (s.charAt(i) == ' ') {
    //                 i--;
    //             }
    //             end = i;
    //         }
    //     }
    //     ans.append(s.substring(i + 1, end + 1));
    //     return ans.toString().trim();
    // }
}
