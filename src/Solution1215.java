/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-15 17:44
 *
 * 这个题目其实是有数学规律的，比如需要求前n个数字中的1，并不需要求到 a[n] 是多少
 *
 * 你可以设置一个sum，sum+=a[i]，当这个和大于等于n的时候，就表示数字的总数量已经达到了n，因为这个数组的值的意义就是接下数据的个数。
 * 那1的个数就是 sum>=n时，数组a的所有偶数位置上的数字之和，通过这样就能快速计算出结果，不需要计算到 a[n]就可以知道结果了
 *
 * 但是时间复杂度都是O(n)
 **/
public class Solution1215 {
    /**
     * @param n: an integer
     * @return: the number of '1's in the first N number in the magical string S
     */
    public int magicalString(int n) {
        // write your code here

        int[] s = new int[100000];
        s[0] = 1;
        int i = 0;
        int j = 1;
        int sum = 0;
        boolean index = false;
        int res=0;
        while (j <= n) {
            if (!index) {
                if (s[i] == 1) {
                    s[j] = 3 ^ s[j - 1];
                } else {
                    s[j] = s[j - 1];
                    index = true;
                }
            } else {
                if (s[i] == 1) {
                    s[j] = 3 ^ s[j - 1];
                    index = true;
                } else {
                    s[j] = 3 ^ s[j - 1];
                    ++j;
                    s[j] = s[j - 1];
                }
            }
            int temp = sum + s[i];
            if (temp < n) {
                sum += s[i];
                if (i % 2 == 0) {
                    res += s[i];
                }
            } else if (temp == n) {
                if (i % 2 == 0) {
                    res += s[i];
                }
                break;
            } else {
                ++sum;
                if (i % 2 == 0) {
                    ++res;
                }
                break;
            }

            ++i;
            ++j;
        }

        return res;
    }
}
