import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 13:36
 **/
public class Solution407 {
    /**
     * @param a: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] a) {
        // write your code here
        int length = a.length;
        boolean plus = true;
        for (int i = length - 1; i >= 0; --i) {
            if (plus) {
                if (a[i] == 9) {
                    a[i] = 0;
                    plus = true;
                    if(i==0){
                        int[] b = new int[length+1];
                        System.arraycopy(a, 0, b, 1, length);
                        b[0]=1;
                        return b;
                    }
                } else {
                    a[i] = a[i] + 1;
                    plus = false;
                }
            } else {
                break;
            }
        }
        return a;
    }
}
