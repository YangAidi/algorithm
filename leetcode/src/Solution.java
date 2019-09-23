import java.util.HashMap;
import java.util.Map;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-21 12:24
 **/
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            Integer v = map.get(k - sum);
            if (v != null) {
                res += v;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}
