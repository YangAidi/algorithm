import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-16 13:03
 **/
public class Solution138 {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> subarraySum(int[] nums) {
        // write your code here
        Map<Long,Integer> map = new HashMap<>();
        map.put(0L,0);
        List<Integer> res = new ArrayList<>();
        long sum =0;
        for (int i=0;i<nums.length;++i){
            sum+=nums[i];
            if(map.containsKey(sum)){
                res.add(map.get(sum));
                res.add(i);
            }else {
                map.put(sum,i+1);
            }
        }
        return res;

    }
}
