package pdd;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-11 16:44
 **/

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            sum += a[i];
        }
        int avg = sum % l;
        int i = avg - 1;
        int j = avg + 1;
        boolean has = false;
        for (int aa : a) {
            if (aa == avg) {
                has = true;
            }
        }

        int left=0;
        int right=0;
        int count=0;
        for (int k = 0; k < l; ++k) {
            int min = 0;
            if (avg - (l - a[k]) > a[k] - avg) {
                min = a[k] - avg;
                ++left;
            } else {
                min = avg - (l - a[k]);
                ++right;
            }
            count+=min;
        }


        System.out.println(count);
    }
}