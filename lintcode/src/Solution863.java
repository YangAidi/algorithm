import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-30 17:41
 **/
public class Solution863 {
    /**
     * @param nums: a list of integers
     * @return: return an integer
     */
    public int pathSum(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        int[][] a = new int[4][10];
        for (int i : nums) {
            a[i / 100][i / 10 % 10] = i % 10;
        }

        int[] b = new int[20];
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 10; ++j) {
                if (a[i][j] != 0) {
                    b[((int) Math.pow(2, i + 1)) + j - 1] = a[i][j];
                }
            }
        }
        boolean[] bb = new boolean[20];
        int sum = 0;
        for (int i = 20; i > 0; --i) {
            if (b[i] != 0 && !bb[i]) {
                int j = i;
                for (; j > 0; ) {
                    // 可以优化的地方，内部节点可以算出sum
                    bb[j] = true;
                    sum += b[j];
                    j = j / 2;
                }
            }
        }

        return sum;
    }
}
