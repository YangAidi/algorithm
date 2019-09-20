/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-22 16:41
 **/
public class Solution1010 {
    /**
     * @param grid: a 2D array
     * @return: the maximum total sum that the height of the buildings can be increased
     */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        // Write your code here
        if (grid.length < 1 || grid[0].length < 1) {
            return 0;
        }
        int j = grid[0].length;
        int i = grid.length;

        int[] max1 = new int[i];
        int[] max2 = new int[j];

        for (int ii = 0; ii < i; ++ii) {
            for (int jj = 0; jj < j; ++jj) {
                if (grid[ii][jj] > max1[ii]) {
                    max1[ii] = grid[ii][jj];
                }
                if (grid[ii][jj] > max2[jj]) {
                    max2[jj] = grid[ii][jj];
                }
            }
        }

        int sum = 0;
        for (int ii = 0; ii < i; ++ii) {
            for (int jj = 0; jj < j; ++jj) {
                sum+=Math.min(max1[ii],max2[jj])-grid[ii][jj];
            }
        }
        return sum;
    }
}
