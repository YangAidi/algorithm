import com.sun.tools.javac.util.StringUtils;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-16 15:02
 **/
public class Solution678 {
    /**
     * @param str: String
     * @return: String
     */
    public String shortestPalindrome(String str) {
        // Write your code here
        if (str == null || str.isEmpty()) {
            return str;
        }
        int left = 0;
        int right = str.length() - 1;
        int rightBegin = right;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right--)) {
                ++left;
            } else {
                left = 0;
                right = --rightBegin;
            }
        }
        int count = left == right ? left * 2 + 1 : left * 2;

        StringBuilder need = new StringBuilder();
        for (int i = str.length() - 1; i >= count; --i) {
            need.append(str.charAt(i));
        }
        return need + str;
    }
}
