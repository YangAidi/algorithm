import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-13 20:07
 **/
public class Solution774 {
    /**
     * @param s: a string represent DNA sequences
     * @return: all the 10-letter-long sequences
     */
    public List<String> findRepeatedDna(String s) {
        // write your code here
        Set one = new HashSet();
        Set two = new HashSet();
        for (int i = 0; i < s.length() - 9; i++) {
            String tmp = s.substring(i, i + 10);
            if (!one.add(tmp)) {
                two.add(tmp);
            }
        }
        return new ArrayList(two);
    }
}
