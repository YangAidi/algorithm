/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-07 13:38
 **/
public class Solution1350B {
    /**
     * @param n: a integer
     * @return: return a string
     */
    public String convertToTitle(int n) {
        if (n == 1) {
            return "A";
        }
        // write your code here
        StringBuilder res = new StringBuilder();
        String[] s = new String[]{"", "A", "B", "C", "D", "E", "F", "G", "H",
                "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        while (n > 0) {
            int b = n % 26;
            if (b == 0) {
                b = 26;
                n = n / 26 - 1;
            } else {
                n = n / 26;
            }
            res.insert(0, s[b]);

        }

        return res.toString();
    }


}
