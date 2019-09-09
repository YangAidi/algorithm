/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 14:05
 **/
public class Solution491 {
    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        StringBuilder s = new StringBuilder();
        while (num > 0) {
            s.append(num % 10);
            num /= 10;
        }
        for (int i = 0, j = s.length() - 1; i <= j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
