/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-12 14:45
 **/
public class Solution159B {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        int target = nums[nums.length - 1];

        // find the first element <= target
        while (start + 1 < end) {
            //用来控制区间大小
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                //如果mid位置上的数字小于等于最右端的数字时，区间向左移动
                end = mid;
            } else {
                start = mid;
            }
        }
        return Math.min(nums[start], nums[end]);
        //最终返回start和end位置上较小的数字即可

    }
}
