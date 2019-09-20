import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-04-24 17:27
 **/
public class Solution1282 {
    /**
     * @param s: a string
     * @return: reverse only the vowels of a string
     */
    public String reverseVowels(String s) {
        // write your code here
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        String vowels = "aeiouAEIOU";
        while (i < j) {
            while (i < j && !(chars[i] == 'a' || chars[i] == 'o' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'u'
                    || chars[i] == 'A'|| chars[i] == 'O'|| chars[i] == 'E'|| chars[i] == 'I'|| chars[i] == 'U')) {
                ++i;
            }

            while (i < j && !(chars[j] == 'a' || chars[j] == 'o' || chars[j] == 'e' || chars[j] == 'i' || chars[j] == 'u'
                    || chars[j] == 'A'|| chars[j] == 'O'|| chars[j] == 'E'|| chars[j] == 'I'|| chars[j] == 'U')) {
                --j;
            }
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                ++i;
                --j;
            }
        }

        return String.copyValueOf(chars);
    }
}
