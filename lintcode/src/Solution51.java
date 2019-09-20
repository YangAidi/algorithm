import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-16 11:26
 **/
public class Solution51 {

    /*
     * @param nums: A list of integers
     * @return: A list of integers that's previous permuation
     */
    public List<Integer> previousPermuation(List<Integer> nums) {
        // write your code here
        int length = nums.size();
        for (int i = length - 1; i >= 0; --i) {
            if (i == 0) {
                revert(nums, 0, length - 1);
            } else if (nums.get(i) < nums.get(i - 1)) {
                revert(nums, i, length - 1);
                int j = i;
                int temp = nums.get(i - 1);
                while (j < length && temp < nums.get(j)) {
                    ++j;
                }

                nums.set(i - 1, nums.get(j));
                nums.set(j, temp);

                break;
            }
        }
        return nums;
    }


    public void revert(List<Integer> nums, int begin, int end) {
        while (begin < end) {
            int temp = nums.get(begin);
            nums.set(begin, nums.get(end));
            nums.set(end, temp);
            ++begin;
            --end;
        }
    }
}
