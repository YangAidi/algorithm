/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-16 16:24
 **/
public class Solution148 {
    /**
     * @param nums: A list of integer which is 0, 1 or 2
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
        int[] a = new int[3];
        for (int num : nums) {
            a[num]++;
        }
        int i = 0;
        for (; i < a[0]; ++i) {
            nums[i] = 0;
        }
        for (; i < a[0] + a[1]; ++i) {
            nums[i] = 1;
        }
        for (; i < a[0] + a[1] + a[2]; ++i) {
            nums[i] = 2;
        }
    }
}
