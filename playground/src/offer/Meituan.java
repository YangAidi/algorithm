package offer;

import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-22 14:30
 **/
public class Meituan {
    public void getMaxString(){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s == null || s.isEmpty()) {
            return;
        }
        char[] array = s.toCharArray();
        int[] index = new int[26];
        for (int i = 0; i < 26; ++i) {
            index[i] = -1;
        }
        int max = 0;
        int l = 0;
        int r = 0;
        int lTemp = 0;
        int maxTemp = 0;
        for (int i = 0; i < array.length; ++i) {
            if (index[array[i] - 'a'] != -1) {
                int thisLength = i - index[array[i] - 'a'];
                if (thisLength > max) {
                    r = i;
                    max = maxTemp;
                    l=lTemp;
                }

                ++lTemp;
            } else {
                ++maxTemp;

                if (maxTemp > max) {
                    r = i;
                    max = maxTemp;
                    l = lTemp;
                }
            }

            index[array[i] - 'a']=i;
        }
        System.out.println(max+" "+l+" "+r);
    }
}
