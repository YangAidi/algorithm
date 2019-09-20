/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 22:25
 **/
public class Solution75 {
    /**
     * @param a: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] a) {
        // write your code here
        return find(a, 0, a.length - 1);
    }

    private int find(int[] a, int l, int r) {
        if (l - r == 2) {
            return l + 1;
        }
        int mid = (l + r) / 2;
        int pre = a[mid - 1];
        int later = a[mid + 1];
        int v = a[mid];
        if (pre < v && later < v) {
            return mid;
        }
        if (v < pre) {
            return find(a, l, mid);
        } else {
            return find(a, mid , r);
        }
    }
}
