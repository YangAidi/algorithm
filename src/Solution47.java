import java.util.List;
import java.util.Objects;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-30 18:18
 * 暴力解法
 * todo 之前是用==判断，没法通过，换成equals就可以了，什么鬼
 **/
public class Solution47 {
    /*
     * @param nums: a list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int max = nums.get(0);
        int maxnum = 0;
        for (int i = 0; i < nums.size(); ++i) {
            int sum = 0;
            for (Integer num : nums) {
                if (Objects.equals(nums.get(i), num)) {
                    ++sum;
                }
            }

            if (sum > nums.size() / 3 && sum > maxnum) {
                max = nums.get(i);
                maxnum = sum;
            }

        }
        return max;
    }
}
