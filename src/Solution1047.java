import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-12-17 17:54
 **/
public class Solution1047 {
    /**
     * @param s: the given string
     * @return: whether this string is valid
     */

    private byte[] bytes = new byte[101];
    private int index = 0;

    public boolean checkValidString(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Write your code here
        bytes = s.getBytes();
        for (Byte b : bytes) {
            if (b == '(') {
                ++index;
            } else if (b == ')') {

            } else if (b == '*') {

            }
        }
        return true;
    }
}
