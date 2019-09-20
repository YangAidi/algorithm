import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-14 13:37
 **/
public class Solution1190 {
    /**
     * @param s: a string
     * @param d: List[str]
     * @return: return a string
     */
    public String findLongestWord(String s, List<String> d) {
        // write your code  here
        d.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length() < o2.length()) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }
        });

        for (String dd : d) {
            int i = 0;
            int j = 0;
            for (; i < s.length(); ) {
                if (dd.charAt(j) == s.charAt(i)) {
                    ++j;
                    ++i;
                    if (j == dd.length()) {
                        return dd;
                    }
                } else {
                    ++i;
                }
            }
        }
        return "";
    }
}
