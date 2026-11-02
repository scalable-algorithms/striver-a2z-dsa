package striver_a2z_dsa.strings.easy;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    // solution 3
    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    // solution 2
    // private static boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) {
    //         return false;
    //     }

    //     int[] count = new int[26];
    //     for (int i = 0; i < s.length(); i++) {
    //         count[s.charAt(i) - 'a']++;
    //         count[t.charAt(i) - 'a']--;
    //     }

    //     for (int i = 0; i < 26; i++) {
    //         if (count[i] != 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // Time complexity is O(n + m)
    // n= size of the s
    // m = size of the t
    // If the problem guarantees both strings have the same length (n == m), then:
    //Time Complexity = O(n)
    // private static boolean isAnagram(String s, String t) {
    //     int[] sArr = new int[26];
    //     int[] tArr = new int[26];

    //     for (char c : s.toCharArray()) {
    //         sArr[c - 'a']++;
    //     }
    //     for (char c : t.toCharArray()) {
    //         tArr[c - 'a']++;
    //     }

    //     for (int i = 0; i < 26; i++) {
    //         if (sArr[i] != tArr[i]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

}
