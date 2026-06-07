package striver_a2z_dsa.strings.easy;

public class IsomorphicStrings {

    public static void main(String[] args) {
        // String s = "aa";
        // String t = "ab";
        String s = "bbbaaaba";
        String t = "aaabbbba";
        System.out.println(isIsomorphic(s, t));
    }

    // solution 2
    private static boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS[c1] != mapT[c2]) {
                return false;
            }
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }
        return true;
    }

    // private static boolean isIsomorphic(String s, String t) {
    //     Map<Character, Character> tToS = new HashMap<>();
    //     Map<Character, Character> sToT = new HashMap<>();
    //     int i = 0;
    //     while (i < s.length()) {
    //         char c1 = s.charAt(i);
    //         char c2 = t.charAt(i);
    //         if (tToS.containsKey(c2) && tToS.get(c2) != c1) {
    //             return false;
    //         }
    //         if (sToT.containsKey(c1) && sToT.get(c1) != c2) {
    //             return false;
    //         }
    //         tToS.put(c2, c1);
    //         sToT.put(c1, c2);
    //         i++;
    //     }
    //     return true;
    // }

}
