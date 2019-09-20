import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 15:28
 **/
public class Solution92 {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param a: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] a) {
        boolean[] f = new boolean[m + 1];
        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j <= m; j++) {
                f[j] = false;
            }
        }
        f[0] = true;
        for (int i = 1; i <= a.length; i++) {
            for (int j = 0; j <= m; j++) {
//                f[j] = f[j];
                if (j >= a[i-1] && f[j - a[i-1]]) {
                    f[j] = true;
                }
            } // for j
        } // for i

        for (int i = m; i >= 0; i--) {
            if (f[i]) {
                return i;
            }
        }

        return 0;
    }
}
