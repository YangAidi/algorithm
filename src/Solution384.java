import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-08 22:30
 **/
public class Solution384 {
    /**
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        // write your code here
        if (s == null || s.length() < 1) {
            return 0;
        }

        int[] index = new int[260];
        Arrays.fill(index,-1);
        int max = 0;
        int begin=0;
        for (int i = 0; i < s.length(); ++i) {
                int last = index[s.charAt(i)];
                if(last<begin) {
                    int tempLength = i - begin + 1;
                    if (tempLength > max) {
                        max = tempLength;
                    }
                }else {
                    begin=last+1;
                }

            index[s.charAt(i)] = i;
        }
        return max;
    }
}
