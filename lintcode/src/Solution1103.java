/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-06-08 15:13
 **/
public class Solution1103 {
    public static void main(String[] args){
        System.out.println(new Solution1103().isPossible(new int[]{1,2,3,3,4,4,5,5}));
    }
    /**
     * @param nums: a list of integers
     * @return: return a boolean
     */
    public boolean isPossible(int[] nums) {
        // write your code here
        int i=-1;
        int k=0;
        while (++i<nums.length-1) {
            ++k;
            if(nums[i]==nums[i+1]){
                if(k<3){
                    return false;
                }
                k=0;
            }
        }
        if(k<3){
        return false;}else {
            return true;
        }
    }
}
