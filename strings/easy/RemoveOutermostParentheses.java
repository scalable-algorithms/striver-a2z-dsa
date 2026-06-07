package striver_a2z_dsa.strings.easy;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        // String s = "(()())(())(()(()))"; // output : "()()()()(())"
        // String s = "()()";  // output : ""
        String s = "(()())(())"; // output : "()()()"
        System.out.println(removeOuterParentheses(s));
    }

    // solution 3 : better version
    /**
    * Time Complexity: O(n)
    * - Traverse the string once and process each character in O(1).
    *
    * Auxiliary Space Complexity: O(1)
    * - Uses only a depth counter.
    *
    * Output Space Complexity: O(n)
    * - StringBuilder stores the resulting string.
    *
    * Total Space Complexity: O(n)
    * - O(1) auxiliary + O(n) output space.
    */
    private static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) {
                    ans.append(c);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }

    // Solution 2
    // private static String removeOuterParentheses(String s) {
    //     StringBuilder ans = new StringBuilder();
    //     int counter = 0;
    //     for (char c : s.toCharArray()) {
    //         if (counter == 0 && c == '(') {
    //             counter++;
    //         } else {
    //             if (c == '(') {
    //                 counter++;
    //             } else {
    //                 counter--;
    //             }
    //             if (counter != 0) {
    //                 ans.append(c);
    //             }
    //         }
    //     }
    //     return ans.toString();
    // }

    /**
     * TC : O(n) -> we iterate all the chars in the String s.
     * Inside each iteration:
     * stack.isEmpty() → O(1)
     * stack.push() → O(1)
     * stack.pop() → O(1)
     * ans.append() → O(1) amortized
     * 
     * SC : O(n)
     * ex : ((((())))) -> As we read the opening parentheses: putting in stack
     * stack grows At one point, it may contain almost n/2 characters.
     * So stack memory grows proportional to input size.
     * 
     * Output Space : Memory used to store the result that must be returned.
     * example here is StringBuilder
     * 
     * Auxiliary Space : Memory used temporarily by the algorithm while solving the problem.
     * It helps compute the answer. But they are not the answer itself.This is auxiliary space.
     * example here is Stack
     * 
     */
    // private static String removeOuterParentheses(String s) {
    //     if (s.isEmpty())
    //         return s;
    //     StringBuilder ans = new StringBuilder();
    //     Stack<Character> stack = new Stack<>();
    //     for (char c : s.toCharArray()) {
    //         if (c == '(') {
    //             if (!stack.isEmpty()) {
    //                 ans.append(c);
    //             }
    //             stack.push(c);
    //         } else {
    //             stack.pop();
    //             if (!stack.isEmpty()) {
    //                 ans.append(c);
    //             }
    //         }
    //     }
    //     return ans.toString();
    // }

}

/**
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where
 * A and B are valid parentheses strings, and + represents string concatenation.
 *
 *  *For example, "", "()", "(())()", and "(()(()))" are all valid parentheses
 * strings. A valid parentheses string s is primitive if it is nonempty, and
 * there does not exist a way to split it into s = A + B, with A and B nonempty
 * valid parentheses strings.
 *
 * *Given a valid parentheses string s, consider its primitive decomposition: s
 * = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
 * Return s after removing the outermost parentheses of every primitive string
 * in the primitive decomposition of s.
 */

/**
 * What is a Primitive Parentheses String?
 * A primitive string is a valid parentheses string that cannot be split into two non-empty valid parentheses strings.
 * ex : () -> we can't split it into 2 parts, so it is premivtive.
 * ex : (()) -> Can we split it into two valid valid-parentheses strings? NO
 * ex : ()() -> Can we split it? YES - () + () both are valid  -> so it is NON Premitive.
 * 
 * What is Primitive Decomposition?
 * We break the whole string into the largest primitive pieces.
 * ex : (()())(())(()(()))
 * Primitive decomposition: (()()) + (()) + (()(()))
 * where each peice is a premitive.
 * 
 * What does "remove outermost parentheses" mean?
 * for every premitive Remove the first ( and the last ).
 */
