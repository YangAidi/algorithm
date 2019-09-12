import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-12 15:02
 **/
public class Solution545 {
    /*
     * @param k: An integer
     */
    public Solution545(int k) {
        // do intialization if necessary
        queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        this.k = k;
    }

    PriorityQueue<Integer> queue;
    int k;

    /*
     * @param num: Number to be added
     * @return: nothing
     */
    public void add(int num) {
        // write your code here
        queue.add(num);
    }

    /*
     * @return: Top k element
     */
    public List<Integer> topk() {
        // write your code here
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>((o1, o2) -> o2 - o1);
        queue2.addAll(queue);
        for (int i = 0; i < Math.min(queue.size(), k); ++i) {
            res.add(queue2.poll());
        }
        return res;
    }
}
