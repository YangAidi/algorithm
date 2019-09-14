/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 14:55
 **/
public class Solution142 {
    /**
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
        if (n == 0) {
            return false;
        }
        while (true) {
            if ((n & 1) == 1) {
                n >>= 1;
                if (n == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            n >>= 1;
        }
    }
}
