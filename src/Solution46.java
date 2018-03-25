import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-25 17:15
 * 408出现过的题目？或者是模拟题见过的
 **/
public class Solution46 {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        if(nums==null||nums.size()==0)return -1;
        int index=nums.get(0);
        int n=0;
        for(int i=0;i<nums.size();++i)
        {
            if(index==nums.get(i))
            {
                n++;
            }else
            {
                --n;
                if(n==0)
                {
                    index=nums.get(i+1);
                }
            }
        }
        int k=0;
        for(int num:nums)
        {
            if(num==index)
            {
                ++k;
            }
        }
        if(k>=nums.size()/2)
            return index;
        else
            return -1;
    }
}
