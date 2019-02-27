/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-02-25 17:12
 **/
public class Solution767 {
    /**
     * @param nums: a integer array
     * @return: nothing
     */
    public void reverseArray(int[] nums) {
        // write your code here
        int i=0;
        int j = nums.length-1;
        while (i<=j){
            int k=nums[i];
            nums[i++]=nums[j];
            nums[j--]=k;
        }
    }
}
