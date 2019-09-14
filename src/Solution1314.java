/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 21:37
 **/
public class Solution1314 {
    /**
     * @param n: an integer
     * @return: if n is a power of two
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }
}
