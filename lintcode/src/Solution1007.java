/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-30 10:40
 **/
public class Solution1007 {
    /**
     * @param nums: a list of integers
     * @return: return a boolean
     */
    public boolean xorGame(int[] nums) {
        int xor = 0;
        for (int i: nums) {
            xor ^= i;
        }
        return xor == 0 || nums.length % 2 == 0;
    }
}
