import java.util.HashMap;
import java.util.Map;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-07 16:34
 **/
public class Solution994 {
    /**
     * @param nums: a binary array
     * @return: the maximum length of a contiguous subarray
     */
    public int findMaxLength(int[] nums) {
        // Write your code here

        int d = 0;
        int max = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i =0;i<nums.length;++i){
            if(nums[i]==0){
                ++d;
            }else {
                --d;
            }
            if(map.containsKey(d)){
                if(i-map.get(d)>max){
                    max = i-map.get(d);
                }
            }else {
                map.put(d,i);
            }
        }

        return max;
    }
}