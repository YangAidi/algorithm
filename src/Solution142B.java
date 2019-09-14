/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 15:02
 **/
/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 14:55
 **/
public class Solution142B {
    /**
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }
}

