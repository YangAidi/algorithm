import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-13 13:44
 **/
public class Solution33 {
    /*
     * @param n: The number of queens
     * @return: All distinct solutions
     */
    public List<List<String>> solveNQueens(int n) {
        // write your code here
        if (n > 0) {
            c = new int[n];
            queen(0, n, new ArrayList<>());
        }
        return res;
    }

    private int total = 0;
    private int[] c;
    List<List<String>> res = new ArrayList<>();

    private void queen(int row, int n, List<String> pre) {
        if (row == n) {
            res.add(pre);
        } else {
            StringBuilder s = new StringBuilder();
            for (int col = 0; col != n; col++) {
                c[row] = col;
                if (isOk(row)) {
                    StringBuilder sb = new StringBuilder(s).append("Q");
                    int i = n - col - 1;
                    while (i-- > 0) {
                        sb.append(".");
                    }
                    List<String> list = new ArrayList<>(pre);
                    list.add(sb.toString());
                    queen(row + 1, n, list);
                }
                s.append(".");

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
