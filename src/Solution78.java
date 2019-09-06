/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-06 12:08
 **/
public class Solution78 {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        if(strs.length == 0){
            return "";
        }
        int min = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < min; ++i) {
            char c = strs[0].charAt(i);
            boolean ok = true;
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                s.append(c);
            } else {
                break;
            }
        }
        return s.toString();
    }
}
