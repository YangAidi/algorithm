import java.util.HashMap;
import java.util.Map;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-21 12:24
 **/
class Solution1 {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;++i){
            if(h.containsKey(t-nums[i])){
                return new int[]{h.get(t-nums[i]),i};
            }else{
                h.put(nums[i],i);
            }
        }
        return new int[]{t,0};
    }
}
