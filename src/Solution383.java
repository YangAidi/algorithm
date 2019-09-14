/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 21:36
 **/
public class Solution383 {
    /**
     * @param heights: a vector of integers
     * @return: an integer
     */
    public int maxArea(int[] heights) {
        // write your code here
        int l = 0;
        int r = heights.length - 1;

        int max = 0;
        while (l < r) {
            max = Math.max(max,Math.min(heights[l], heights[r]) * (r - l));
            if (heights[l] < heights[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return max;
    }
}
