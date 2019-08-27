import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-26 14:26
 **/
public class Solution {
    /**
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here

        PriorityQueue<Integer> queue = new PriorityQueue();
        PriorityQueue<Integer> queue1 = new PriorityQueue(Arrays.asList(nums1));
        PriorityQueue<Integer> queue2 = new PriorityQueue(Arrays.asList(nums2));
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            Integer a = queue1.poll();
            Integer b = queue2.poll();
//            if ()



        }
        return nums1;
    }
}
