/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-15 10:53
 *
 * WA
 *
 * ()(()
 *
 * 这种情况会算错
 *
 **/
public class Solution193 {
    /**
     * @param s: a string
     * @return: return a integer
     */
    public int longestValidParentheses(String s) {
        // write your code here
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int max = 0;
        int res = 0;
        int left = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(') {
                ++left;
            } else if (c == ')') {
                if (left > 0) {
                    --left;
                    ++res;
                    max = Math.max(max, res);
                } else {
                    res = 0;
                    left = 0;
                }
            }

        }

        return max * 2;
    }
}
