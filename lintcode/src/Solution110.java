import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-12 13:22
 **/
public class Solution110 {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here

        int[][] a = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; ++i) {
            Arrays.fill(a[i], Integer.MAX_VALUE);
        }
        a[0][0] = grid[0][0];
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                int up = i == 0 ? Integer.MAX_VALUE : a[i - 1][j];
                int down = i == grid.length - 1 ? Integer.MAX_VALUE : a[i + 1][j];
                int left = j == 0 ? Integer.MAX_VALUE : a[i][j - 1];
                int right = j == grid[0].length - 1 ? Integer.MAX_VALUE : a[i][j + 1];
                if (i != 0 || j != 0) {
                    int path = Math.min(up, Math.min(Math.min(down, left), right));
                    a[i][j] = path == Integer.MAX_VALUE ? Integer.MAX_VALUE : path + grid[i][j];
                }
            }
        }
        return a[grid.length - 1][grid[0].length - 1];
    }
}
