import java.util.HashMap;
import java.util.Map;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-10-15 10:42
 **/
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int res = 0;
        for (int num : nums) {
            sum += num;
            res += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}
