/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-30 23:22
 **/
public class Solution52 {
    /**
     * @param nums: A list of integers
     * @return: A list of integers
     */
    public int[] nextPermutation(int[] nums) {
        // write your code here
        if (nums.length < 2) {
            return nums;
        }
        for (int i = nums.length - 1; i > 0; --i) {
            if (nums[i - 1] < nums[i]) {
                revert(nums, i, nums.length - 1);
                int temp = i - 1;
                int temppppp = nums[temp];
                while (nums[i++] <= temppppp) {

                }
                --i;
                nums[temp] = nums[i];
                nums[i] = temppppp;
                break;
            }else if(i==1){
                revert(nums, 0, nums.length - 1);
                break;
            }
        }


        return nums;
    }

    public void revert(int[] nums, int begin, int end) {
        while (begin < end) {
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            ++begin;
            --end;
        }
    }
}
