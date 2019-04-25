/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-04-25 08:21
 **/
public class ms3 {
    public int test(int input1,int[] input2){
    int[][] dp = new int[5000][5000];
        for (int i = 0; i < 5000; ++i) {
        for (int j = 0; j < 5000; ++j) {
            dp[i][j] = -1;
        }
    }
        return dp(0, input1 - 1,input2,dp);
}


    private int dp(int lift, int right, int[] input2, int[][] dp) {
        if (dp[lift][right] != -1) {
            return dp[lift][right];
        }
        if (lift == right) {
            return dp[lift][right] = 1;
        }
        if (right - lift == 1) {
            return dp[lift][right] = (input2[lift] == input2[right] ? 1 : 2);
        }
        int ans = Integer.MAX_VALUE;
        for (int k = lift; k < right; k++) {
            ans = Math.min(ans, dp(lift, k, input2, dp) + dp(k + 1, right, input2, dp));
        }
        if (input2[lift] == input2[right]) {
            ans = Math.min(ans, dp(lift + 1, right - 1, input2, dp));
        }
        return dp[lift][right] = ans;
    }
}
