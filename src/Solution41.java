/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-27 17:57
 **/
public class Solution41 {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        int sum=0;
        int max=nums[0];
        int maxsum=nums[0];
        for (int num : nums) {
            if(num>max) max=num;
            sum += num;
            if(sum>maxsum)maxsum=sum;
            if (sum <= 0) {
                sum = 0;
            }
        }
        return maxsum<max?max:maxsum;
    }
}
