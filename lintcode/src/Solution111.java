/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 13:58
 **/
public class Solution111 {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if(n<3){
            return n;
        }
        int a = 1;
        int b=2;

        for(int i=2;i<n;++i){
            int c = a+b;
            a=b;
            b=c;

        }
        return b;

    }
}
