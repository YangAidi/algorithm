/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-07 13:37
 **/
public class Solution1350 {
    public String convertToTitle (int n) {
        StringBuilder str = new StringBuilder();

        while (n > 0) {
            n--;
            str.append ( (char) ( (n % 26) + 'A'));
            n /= 26;
        }
        return str.reverse().toString();
    }
}
