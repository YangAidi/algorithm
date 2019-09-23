/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 18:58
 **/
class Solution96 {
    public int numTrees(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] a = new int[n + 1];
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                a[i] += a[j - 1] * a[i - j];
            }
        }
        return a[n];
    }
}
