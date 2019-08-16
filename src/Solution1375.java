/**
 * 本参考程序来自九章算法，由 @九章算法助教团队 提供。版权所有，转发请注明出处。
 * - 九章算法致力于帮助更多中国人找到好的工作，教师团队均来自硅谷和国内的一线大公司在职工程师。
 * - 现有的面试培训课程包括：九章算法班，系统设计班，算法强化班，Java入门与基础算法班，Android 项目实战班，
 * - Big Data 项目实战班，算法面试高频题班, 动态规划专题班
 * - 更多详情请见官方网站：http://www.jiuzhang.com/?source=code
 */

public class Solution1375 {
    /**
     * @param s: a string
     * @param k: an integer
     * @return: the number of substrings there are that contain at least k distinct characters
     */
    public long kDistinctCharacters(String s, int k) {
        // Write your code here
        int[] cnt = new int[26];
        int count = 0;
        int l = 0, r = 0;
        long ans = 0;
        int len = s.length();
        while (l <= r && l < len) {
            while (count < k && r < len) {
                cnt[s.charAt(r) - 'a']++;
                if (cnt[s.charAt(r) - 'a'] == 1) {
                    count++;
                }
                r++;
            }
            if (count == k) {
                ans += len - r + 1;
            }
            if (cnt[s.charAt(l) - 'a'] == 1) {
                count--;
            }
            cnt[s.charAt(l) - 'a']--;
            l++;
        }
        return ans;
    }
}