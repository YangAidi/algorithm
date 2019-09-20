import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 12:09
 **/
public class Solution114 {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 0;
        for (int i = 1; i <= n; ++i) {
            dp[1][i] = 1;
        }
        for (int i = 1; i <= m; ++i) {
            dp[i][1] = 1;
        }

        for (int i = 2; i <= m; ++i) {
            for (int j = 2; j <= n; ++j) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}
