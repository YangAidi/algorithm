/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 14:40
 **/
public class Solution89 {
    /**
     * @param a: An integer array
     * @param k: A positive integer (k <= length(A))
     * @param target: An integer
     * @return: An integer
     */
    public int kSum(int[] a, int k, int target) {
        // write your code here
        // dp[i][j][k]表示前i个数里选j个和为k的方案数

        int n = a.length;
        int[][][] f = new int[n + 1][k + 1][target + 1];
        for (int i = 0; i < n + 1; i++) {
            f[i][0][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k && j <= i; j++) {
                for (int t = 1; t <= target; t++) {
                    f[i][j][t] = 0;
                    if (t >= a[i - 1]) {
                        f[i][j][t] = f[i - 1][j - 1][t - a[i - 1]];
                    }
                    f[i][j][t] += f[i - 1][j][t];
                } // for t
            } // for j
        } // for i
        return f[n][k][target];
    }
}
