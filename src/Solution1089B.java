/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-06 17:07
 **/
public class Solution1089B {
    /**
     * @param s: the given string
     * @return: whether this string is valid
     */
    public boolean checkValidString(String s) {
        // Write your code here
        int len=s.length();
        int l=0, cp=0;
        for (int i=0; i<len; i++) {
            if (s.charAt(i)=='(') {
                l++;
                cp++;
            } else if (s.charAt(i)=='*') {
                if (l>0) {
                    l--;
                }
                cp++;
            } else {
                if (l>0) {
                    l--;
                }
                cp--;
                if (cp<0) {
                    return false;
                }
            }
        }
        return l == 0;
    }
}
