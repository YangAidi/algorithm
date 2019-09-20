import java.util.HashSet;
import java.util.Set;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-03 10:00
 * 暴力解法超时。
 * 参考答案是n2的复杂度，自己的是n3，所以，唉。
 * 参考答案另外一个秒的地方是，i从0开始，而j是从i开始，就不用自己那个通过Set集合来过滤重复的
 * 数的操作了，而k是从右侧开始，这个就直接降了一个复杂度。
 **/
public class Solution831 {
    /**
     * @param n: an integer
     * @return: the number of solutions
     */
//    public int threeSum2(int n) {
//        // Write your code here
//        int sum = 0;
//        int max = (int) Math.sqrt(n);
//        Set<String> set = new HashSet<String>();
//        for (int i = 0; i <= max; ++i) {
//            for (int j = 0; j <= max; ++j) {
//                for (int k = 0; k <= max; ++k) {
//                    if (i * i + j * j + k * k == n) {
//                        int ii=i,jj=j,kk=k;
//                        int m;
//                        if (ii > jj) {
//                            m = ii;
//                            ii = jj;
//                            jj = m;
//                        }
//                        if (ii > kk) {
//                            m = ii;
//                            ii = kk;
//                            kk = m;
//                        }
//                        if (jj > kk) {
//                            m = jj;
//                            jj = kk;
//                            kk = m;
//                        }
//                        set.add(ii+"/"+jj+"/"+kk);
//                    }
//                }
//            }
//        }
//        return set.size();
//    }
    public int threeSum2(int n) {
        // Write your code here
        int m = (int)Math.round(Math.sqrt(n));
        if (m * m > n) {
            m--;
        }
        int ans = 0;
        for (int i = 0; i <= m; i++) {
            int res = n - i * i;
            int left = i, right = m;
            while (left <= right) {
                int tmp = left * left + right * right;
                if (tmp > res) {
                    right--;
                } else if (tmp < res) {
                    left++;
                } else {
                    ans++;
                    left++;
                }
            }
        }
        return ans;
    }
}
