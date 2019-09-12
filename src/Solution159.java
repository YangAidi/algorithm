/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-12 14:42
 **/
public class Solution159 {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        int min = Integer.MAX_VALUE;
        for(int num:nums)
        {
            min = Math.min(num,min);
        }
        return min;
    }
}
