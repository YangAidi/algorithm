/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-04-24 22:45
 **/
public class Solution1294 {
        /**
         * @param n: an integer
         * @return: if n is a power of three
         */
        public boolean isPowerOfThree(int n) {
            // Write your code here
            n = Math.abs(n);
            int num = 1;
            while (num <= n) {
                if (num == n){
                    return true;
                }
                num *= 3;
            }
            return false;
        }

}
