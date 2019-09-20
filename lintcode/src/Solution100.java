/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-04 11:11
 **/
public class Solution100 {
    public int removeDuplicates(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int size = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[size]) {
                A[++size] = A[i];
            }
        }
        return size + 1;
    }
}