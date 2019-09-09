/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 21:29
 **/
public class Solution141 {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if (x < 2) {
            return x;
        }
        return ((int) find(0, x / 2, x));
    }

    private long find(long l, long r, int x) {
        if (l >= r) {
            return l;
        }
        // 判断区间的时候一个小技巧： mid * mid == x 中使用乘法可能会溢出，
        // 写成 mid == x / mid 即可防止溢出，不需要使用long或者BigInteger
        long mid = (l + r) / 2;
        double mid2 = mid * mid;
        if (mid2 > x ) {
            return find(l, mid-1, x);
        } else if (mid2 == x) {
            return mid;
        } else {
            if((mid + 1) * (mid + 1) > x){
            return mid;
        }
            return find(mid+1, r, x);
        }
    }
}
