import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-03 16:35
 **/
public class Solution426 {
    /**
     * @param s: the IP string
     * @return: All possible valid IP addresses
     */
    public List<String> restoreIpAddresses(String s) {
        // write your code here
        if (!needCharCount(0, s.length())) {
            return new ArrayList<>();
        }
        dfs(s, 0, 0, new StringBuilder());
        return res;
    }

    // count .的个数
    // 当前遍历到第几位了
    private void dfs(String s, int index, int count, StringBuilder pre) {
        int length = s.length();
        String later = s.substring(index, length);
        if (needCharCount(count, later.length())) {
            if (count == 3) {
                if (isIp(later)) {
                    res.add(pre + later);
                }

            } else {
                StringBuilder pre1 = new StringBuilder(pre);
                StringBuilder pre2 = new StringBuilder(pre);
                StringBuilder pre3 = new StringBuilder(pre);
                if (later.length() >= 1) {
                    dfs(s, index + 1, count + 1, pre1.append(s.charAt(index)).append("."));
                    if (later.length() >= 2 && isIp(s.substring(index, index + 2))) {
                        dfs(s, index + 2, count + 1, pre2.append(s.charAt(index)).append(s.charAt(index + 1)).append("."));
                    }
                    if (later.length() >= 3 && isIp(s.substring(index, index + 3))) {
                        dfs(s, index + 3, count + 1, pre3.append(s.charAt(index)).append(s.charAt(index + 1)).append(s.charAt(index+2)).append("."));
                    }
                }
            }
        }
    }

    private List<String> res = new ArrayList<>();

    private boolean isIp(String s) {
        if (s.length() > 3) {
            return false;
        } else if (s.length() == 3) {
            if (s.charAt(0) == '0') {
                return false;
            }
            int value = (s.charAt(0) - '0') * 100 + (s.charAt(1) - '0') * 10 + (s.charAt(2) - '0');
            if (value > 255 || value < 0) {
                return false;
            } else {
                return true;
            }
        } else if (s.length() == 2) {
            if (s.charAt(0) == '0') {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    private boolean needCharCount(int count, int have) {
        count = 4 - count;
        if (have < count || have > count * 3) {
            return false;
        }
        return true;
    }
}
