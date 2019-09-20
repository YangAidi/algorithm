package pdd; /**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-07 16:54
 **/

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n+1];
        for (int i = 0; i < m; ++i) {
            int x = in.nextInt();
            a[in.nextInt()] = 1;
        }
        int count = 0;
        for (int aa : a) {
            if (aa == 1) {
                count++;
            }
        }
        System.out.println(n - count);
    }
}