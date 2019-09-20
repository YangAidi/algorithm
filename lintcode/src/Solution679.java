import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 12:43
 **/
public class Solution679 {
    /*
     * @param : an array of arrays
     * @return: the sum of all unique weighted paths
     */
    public int uniqueWeightedPaths(int[][] grid) {
        // write your codes here
        int n = grid[0].length;
        if(n==0){
            return 0;
        }
        Set<Integer>[] dp = new HashSet[n];

        // 初始化第一行
        dp[0] = new HashSet<>();
        dp[0].add(grid[0][0]);
        for (int i = 1; i < n; ++i) {
            Set<Integer> ss = new HashSet<>();
            for (int v : dp[i-1]) {
                ss.add(v + grid[0][i]);
            }
            dp[i] = ss;
        }

        // 依次遍历下面每一行，取出左边的Set（如果要是 j == 0，不取），和上边的Set，分别加上当前值，再放回Set数组中
        for (int i = 1; i < grid.length; ++i) {
            for (int j = 0; j < n; ++j) {
                Set<Integer> res = new HashSet<>();
                int v = grid[i][j];
                Set<Integer> s = dp[j];
                if (j != 0) {
                    Set<Integer> ss = dp[j - 1];
                    for (int value : ss) {
                        res.add(v + value);
                    }
                }
                for (int value : s) {
                    res.add(v + value);
                }
                dp[j] = res;
            }
        }

        int sum = 0;
        for (int value : dp[grid[0].length - 1]) {
            sum += value;
        }
        return sum;
    }
}
