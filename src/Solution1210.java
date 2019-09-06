import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-06 00:00
 **/
public class Solution1210 {
    /**
     * @param nums: an integer array
     * @return: all the different possible increasing subsequences of the given array
     */
    public List<List<Integer>> findSubsequences(int[] nums) {
        // Write your code here
        dfs(nums, null, 0);

        return new ArrayList<>(res);
    }

    private Set<List<Integer>> res = new HashSet<>();


    private void dfs(int[] nums, List<Integer> l, int i) {
        if (i == nums.length) {
            if (l != null && l.size() >= 2) {
                res.add(new ArrayList<>(l));
            }
            return;
        }
        if (l == null) {
            l = new ArrayList<>();
            l.add(nums[i]);
            dfs(nums, l, i + 1);
            dfs(nums, null, i + 1);
        } else {
            List<Integer> ll = new ArrayList<>(l);
            if (l.get(l.size() - 1) <= nums[i]) {
                l.add(nums[i]);
                dfs(nums, l, i + 1);
            }
            dfs(nums, ll, i + 1);
        }
    }
}
