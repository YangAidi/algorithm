/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-15 10:32
 **/
public class Solution517 {
    /**
     * @param num: An integer
     * @return: true if num is an ugly number or false
     */
    public boolean isUgly(int num) {
        // write your code here
        if (num <= 0) {
            return false;
        }

        while (num != 1) {
            boolean b = false;
            if (num % 5 == 0) {
                num /= 5;
                b = true;
            }
            if (num % 3 == 0) {
                num /= 3;
                b = true;
            }
            if (num % 2 == 0) {
                num /= 2;
                b = true;
            }
            if (!b) {
                return false;
            }

        }
        return true;

    }
}
