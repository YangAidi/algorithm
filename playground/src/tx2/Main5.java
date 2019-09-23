package tx2;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 20:39
 **/
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res = 0;
        HashSet<Long> a = new HashSet<>();
        HashSet<Long> b = new HashSet<>();
        HashSet<Long> aa = new HashSet<>();
        HashSet<Long> bb = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            long k = in.nextLong();
            if (a.contains(k)) {
                aa.remove(k);
            } else {
                aa.add(k);
            }
            a.add(k);
        }
        for (int i = 0; i < n; ++i) {
            long k = in.nextLong();
            if (b.contains(k)) {
                bb.remove(k);
            } else {
                bb.add(k);
            }
            b.add(k);
        }
        HashSet<Long> c = new HashSet<>();
        for (long aaa : aa) {
            for (long bbb : bb) {
                long v = aaa+bbb;
                c.add(v);
            }
        }
        for(long cc:c)
        {
            res^=cc;
        }

        System.out.println(res);
    }
}
