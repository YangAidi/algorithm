/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-25 13:20
 **/
public class Solution1508 {
    /**
     * @param a: a matrix
     * @return: the score
     */
    public int matrixScore(int[][] a) {
        // Write your code here.
        if (a == null || a.length < 1) {
            return 0;
        }
        int row = a.length;
        int col = a[0].length;
        for (int i = 0; i < row; ++i) {
            if (a[i][0] == 0) {
                for (int j = 0; j < col; ++j) {
                    a[i][j] ^= 1;
                }
            }
        }

        int sum = (1 << col - 1) * row;
        for (int i = 1; i < col; ++i) {
            int count = 0;
            for (int[] ints : a) {
                if (ints[i] == 0) {
                    ++count;
                }
            }
            count = Math.max(count, row - count);
            sum += (1 << col - 1 - i) * count;
        }
        return sum;
    }
}
