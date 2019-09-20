/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 14:22
 *
 * DFS 超时
 **/
public class Solution89B {
    /**
     * @param a:      An integer array
     * @param k:      A positive integer (k <= length(A))
     * @param target: An integer
     * @return: An integer
     */
    public int kSum(int[] a, int k, int target) {
        // write your code here
        dfs(a, k, target, 0, 0, 0);
        return res;
    }

    int res = 0;

    public void dfs(int[] a, int k, int target, int sum, int count, int index) {


        if (count == k) {
            if (sum == target) {
                ++res;
            }
            return;
        }
        if (sum > target || index >= a.length) {
            return;
        }

        dfs(a, k, target, sum + a[index], count + 1, index + 1);
        dfs(a, k, target, sum, count, index + 1);

    }
}
