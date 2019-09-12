import java.util.Set;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-12 15:45
 **/
public class Solution107 {
    /*
     * @param s: A string
     * @param dict: A dictionary of words dict
     * @return: A boolean
     */
    public boolean wordBreak(String s, Set<String> dict) {
        // write your code here
        if(s==null||s.length()==0){
            return true;
        }
        if(dict==null||dict.isEmpty()){
            return false;
        }

        boolean[] b = new boolean[s.length()];
        for (int i = 1; i <= s.length(); ++i) {
            for (String ss : dict) {
                int begin = i - ss.length();
                if (begin < 0) {
                    continue;
                }
                String sub = s.substring(begin, i);
                if (sub.equals(ss)) {
                    if (begin > 0 && !b[begin-1]) {
                        continue;
                    }
                    b[i - 1] = true;
                }
            }
        }

        return b[s.length() - 1];
    }
}
