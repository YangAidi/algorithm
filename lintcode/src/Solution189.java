/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-04 10:49
 * 昨天刚在剑指offer上面看到了，A[i]存的值为i的方法，这个题目就用到了，自己还是想不到，naive！！！
 **/
public class Solution189 {

    public int firstMissingPositive(int[] A) {
        if (A == null) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {
            while (A[i] > 0 && A[i] <= A.length && A[i] != (i+1)) {
                int tmp = A[A[i]-1];
                if (tmp == A[i]) {
                    break;
                }
                A[A[i]-1] = A[i];
                A[i] = tmp;
            }
        }

        for (int i = 0; i < A.length; i ++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }

        return A.length + 1;
    }
}
