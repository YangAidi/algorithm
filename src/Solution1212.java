/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-19 19:07
 **/
public class Solution1212 {
    /**
     * @param nums: a binary array
     * @return:  the maximum number of consecutive 1s
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        // Write your code here
        int res=0;
        int count =0;
        for(int num:nums){
            if(num==1){
                ++count;
            }else {
                count=0;
            }
            res = Math.max(count,res);
        }
        return res;

    }
}
