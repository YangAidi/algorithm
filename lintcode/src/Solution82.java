/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-09 21:46
 * 这个方法太TM牛逼了
 **/
public class Solution82 {
    public int singleNumber(int[] A) {
        if(A == null || A.length == 0) {
            return -1;
        }
        int rst = 0;
        for (int i = 0; i < A.length; i++) {
            rst ^= A[i];
        }
        return rst;
    }
}