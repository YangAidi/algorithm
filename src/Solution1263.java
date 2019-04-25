/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-04-24 23:04
 **/
public class Solution1263 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while(i<s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
