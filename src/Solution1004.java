/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-28 16:29
 **/
class Solution1004 {
    public double largestSumOfAverages(int[] A, int K) {
        int n = A.length;
        double[][] dp = new double[K + 1][n + 1];
        double[] sum = new double[n + 1];
        // dp[i][j]表示前j个数分成i段的最大和
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + A[i - 1];
            dp[1][i] = sum[i] / i;
        }
        for (int i = 2; i <= K; i++) {
            for (int j = i; j <= n; j++) {
                // 切成j段，长度 i的范围是 j ~ n
                // 新的一刀 切的位置从 i-1 ~ j可选
                // max(原来的切法,(长度k分成i-1段 + 最后一刀切在哪里))
                for (int k = i - 1; k < j; k++){
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + (sum[j]-sum[k]) / (j-k));
                }
            }
        }
        return dp[K][n];
    }
}
