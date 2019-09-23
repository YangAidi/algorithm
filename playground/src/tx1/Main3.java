package tx1;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-01 21:52
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i]=in.nextInt();
        }


        System.out.println(a[new Random().nextInt(n)]);
    }
}
