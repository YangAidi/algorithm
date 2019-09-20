package offer;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-04 16:49
 **/
public class P3 {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 1};
        while (true) {
            if (nums[0] == nums[nums[0]]) {
                System.out.println(nums[0]);
                break;
            } else {
                int temp = nums[nums[0]];
                nums[nums[0]] = nums[0];
                nums[0] = temp;
            }
        }
    }
}
