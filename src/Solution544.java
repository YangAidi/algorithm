import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-07 18:34
 **/
public class Solution544 {
    /**
     * @param nums: an integer array
     * @param k: An integer
     * @return: the top k largest numbers in array
     */
    public int[] topk(int[] nums, int k) {
        // write your code here

        PriorityQueue<Integer> queue = new PriorityQueue<>(k,(o1,o2)->(o2-o1));
        for(int num:nums){
            queue.add(num);
        }
        int[] res = new int[k];
        for (int i=0;i<k;++i){
            res[i]= queue.poll();
        }
        return res;
    }
}
