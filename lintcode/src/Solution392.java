/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-12 12:56
 **/
public class Solution392 {
    /**
     * @param a: An array of non-negative integers
     * @return: The maximum amount of money you can rob tonight
     */
    public long houseRobber(int[] a) {
        // write your code here

        if(a.length == 0){
            return 0;
        }

        if (a.length < 2) {
            return a[0];
        }

        long i = a[0];
        long j = Math.max(a[0],a[1]);

        for (int k = 2; k < a.length; ++k) {
            long temp = j;
            j = Math.max(j, i + a[k]);
            i = temp;
        }

        return j;
    }
}
