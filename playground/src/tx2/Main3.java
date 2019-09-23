package tx2;

import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 20:17
 **/
public class Main3 {


    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            int k = in.nextInt();
            int[][] res = new int[k][2];
            int kk = 0;
            while (kk < k) {
                int n = in.nextInt();
                int[] a = new int[n];
                int[] dp = new int[100000];
                int sum = 0;
                for (int i = 0; i < n; ++i) {
                    a[i] = in.nextInt();
                    sum += a[i];
                }
                for (int i = 0; i < n; ++i) {
                    for (int j = sum / 2; j >= a[i]; --j) {
                        dp[j] = Math.max(dp[j], dp[j - a[i]] + a[i]);
                    }
                }
//                System.out.print(dp[sum / 2]+" "+(sum - dp[sum / 2]));
                res[kk][0] = Math.min(dp[sum / 2],sum - dp[sum / 2]);
                res[kk][1] = Math.max(dp[sum / 2],sum - dp[sum / 2]);
                ++kk;
            }

            for (int i = 0; i < k; ++i) {
                System.out.print(res[i][0]+" "+res[i][1]+" ");
            }
        }
    }
}
