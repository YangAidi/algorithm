/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-10-21 15:18
 **/
class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0]=nums[0];
        for(int i=1;i<nums.length;++i){
            res[i]=res[i-1]*nums[i];
        }
        int a=1;
        for(int i=nums.length-1;i>0;--i){
            res[i]=res[i-1]*a;
            a*=nums[i];
        }
        res[0]=a;
        return res;
    }
}
