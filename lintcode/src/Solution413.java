/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-08 22:21
 **/
public class Solution413 {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public int reverseInteger(int n) {
        // write your code here
        boolean b = false;

        if (n < 0) {
            n = -n;
            b = true;
        }

        long res = 0L;
        while (n > 0) {
            res = res * 10 + n % 10;

            n /= 10;
        }
        if (res > Integer.MAX_VALUE) {
            res = 0;
        }
        if(b){
            res =-res;
        }

        return ((int) res);

    }
}
