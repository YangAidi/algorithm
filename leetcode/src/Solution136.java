/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 18:32
 **/
public class Solution136 {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}
