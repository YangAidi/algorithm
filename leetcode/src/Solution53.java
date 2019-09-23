/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 17:57
 **/
class Solution53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int temp = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (temp <= 0) {
                temp = nums[i];
            } else {
                temp += nums[i];
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
