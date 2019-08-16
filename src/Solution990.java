
/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-16 16:10
 **/
public class Solution990 {
    /**
     * @param n: The number of integers
     * @return: The number of beautiful arrangements you can construct
     */
    public int countArrangement(int n) {
        // Write your code here
        ++n;
        visit = new boolean[n];
        size = n-1;
        for (int i = 1; i < n; ++i) {
            visit[i] = false;
        }
        for (int i = 1; i < n; ++i) {
            dfs(i, 1);
        }
        return res;
    }

    private boolean[] visit;

    private int res = 0;

    int size;

    /**
     * @param num   当前数字
     * @param index 当前位置
     */
    private void dfs(int num, int index) {
        visit[num] = true;
        if (num % index == 0 || index % num == 0) {
            if (index == size) {
                ++res;
                visit[num]=false;
                return;
            }
            for (int i = 1; i <= size; ++i) {
                if (!visit[i]) {
                    dfs(i, index + 1);
                }
            }
        }
        visit[num]=false;
    }
}
