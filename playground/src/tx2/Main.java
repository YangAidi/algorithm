package tx2;

import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-01 21:39
 **/
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; ++i) {
            int length = in.nextInt();
            String s = in.next();
            if (length < 11) {
                System.out.println("NO");
                continue;
            }
            for (int j = 0; j < length; ++j) {
                if (length - j >= 11 && s.charAt(j) == '8') {
                    System.out.println("YES");
                    break;
                } else if (length - j < 11) {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }

}

