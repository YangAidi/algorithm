/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-25 15:18
 *
 * 循环两边数组，开了一个输出数组out，应该是满足题目的要求了
 * 第一遍++循环 out[i]存储 1~ i的乘积
 * 第二遍--循环 设置一个乘积值afterRes，表示i节点之后的乘积，然后out[i] = out[i - 1] * afterRes
 *
 **/
public class Solution1310 {
    /**
     * @param nums: an array of integers
     * @return: the product of all the elements of nums except nums[i].
     */
    public int[] productExceptSelf(int[] nums) {
        // write your code here
        int[] out = new int[nums.length];
        out[0] = nums[0];
        for (int i = 1; i < out.length; ++i) {
            out[i] = out[i - 1] * nums[i];
        }

        int afterRes = 1;
        for (int i = out.length - 1; i > 0; --i) {
            out[i] = out[i - 1] * afterRes;
            afterRes *= nums[i];
        }

        out[0] = afterRes;
        return out;
    }
}
