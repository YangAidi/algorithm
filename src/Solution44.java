import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-27 18:08
 **/
public class Solution44 {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        int sum=0;
        int min=nums.get(0);
        int minsum=min;
        for (int num : nums) {
            if(num<min) min=num;
            sum += num;
            if(sum<minsum)minsum=sum;
            if (sum >= 0) {
                sum = 0;
            }
        }
        return minsum>min?min:minsum;
    }
}

