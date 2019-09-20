import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-13 14:37
 **/
public class Solution34 {
    /**
     * @param n: The number of queens.
     * @return: The total number of distinct solutions.
     */
    public int totalNQueens(int n) {
        // write your code here
        if (n > 0) {
            c = new int[n];
            queen(0, n);
        }
        return total;
    }

    private int total = 0;
    private int[] c;
    List<List<String>> res = new ArrayList<>();

    private void queen(int row, int n) {
        if (row == n) {
            ++total;
        } else {
            StringBuilder s = new StringBuilder();
            for (int col = 0; col != n; col++) {
                c[row] = col;
                if (isOk(row)) {
                    queen(row + 1, n);
                }

            }
        }
    }

    private boolean isOk(int row) {
        for (int j = 0; j != row; j++) {
            if (c[row] == c[j] || row - c[row] == j - c[j] || row + c[row] == j + c[j]) {
                return false;
            }
        }
        return true;
    }

}
