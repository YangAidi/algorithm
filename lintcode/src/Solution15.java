import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-12 16:07
 **/
public class Solution15 {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return new ArrayList<List<Integer>>() {
                {
                    add(new ArrayList<Integer>());
                }
            };
        }

        b = new boolean[nums.length];
        dfs(nums, new ArrayList<>());


        return res;
    }

    List<List<Integer>> res = new ArrayList<>();
    private boolean[] b;

    public void dfs(int[] nums, List<Integer> pre) {
        if (pre.size() == nums.length) {
            res.add(pre);
            return;
        }
        for (int j = 0; j < nums.length; ++j) {
            if (b[j]) {
                continue;
            }
            b[j] = true;
            List<Integer> l = new ArrayList<>(pre);
            l.add(nums[j]);
            dfs(nums, l);
            b[j] = false;
        }
    }
}
