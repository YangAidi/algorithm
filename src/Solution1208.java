/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-28 17:14
 **/
public class Solution1208 {
    /**
     * @param nums: the given array
     * @param s:    the given target
     * @return: the number of ways to assign symbols to make sum of integers equal to target S
     */
    public int findTargetSumWays(int[] nums, int s) {
        // Write your code here
        dfs(nums, 0, s);
        return count;
    }

    private int count = 0;

    private void dfs(int[] nums, int index, int sum) {
        int value = nums[index];
        if (index == nums.length - 1) {
            if (value == sum || -value == sum) {
                ++count;
            }
        } else {
            dfs(nums, index + 1, sum - value);
            dfs(nums, index + 1, sum + value);
        }
    }
}
