/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-21 00:25
 **/
class Solution169 {
    public int majorityElement(int[] nums) {
        int res = Integer.MAX_VALUE;
        int count = 0;
        for(int num:nums){
            if(res == Integer.MAX_VALUE){
                res = num;
            }
            if(num!=res){
                count--;
                if(count==0){
                    res = Integer.MAX_VALUE;
                }
            }else{
                count++;
            }
        }
        return res;

    }
}
