import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 20:16
 **/
public class Solution408 {
    /**
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    public String addBinary(String a, String b) {
        // write your code here

        if (a.length() < b.length()) {
            String c = b;
            b = a;
            a = c;
        }
        StringBuilder s = new StringBuilder();
        int up = 0;
        int i = a.length() - 1, j = b.length() - 1;
        for (; i >= 0; --i, --j) {
            int v1 = a.charAt(i) - '0';
            int v2 = j >= 0 ? b.charAt(j) - '0' : 0;
            int v = v1 + v2 + up;
            if (v == 2) {
                up = 1;
                s.insert(0, 0);
            } else if (v == 3) {
                up = 1;
                s.insert(0, 1);
            } else {
                up = 0;
                s.insert(0, v);
            }
        }
        if(up==1){
            s.insert(0,1);
        }
        return s.toString();
    }
}
