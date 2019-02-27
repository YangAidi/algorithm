import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-02-25 23:19
 **/
public class Solution791B {
    /**
     * @param numbers: the numbers
     * @return: the minimum cost
     */
    public int mergeNumber(int[] numbers) {
        // Write your code here
        Queue<Integer> Q = new PriorityQueue<>();
        for(int i = 0; i < numbers.length; i++) {
            Q.add(numbers[i]);
        }
        int ans = 0;
        while(Q.size() > 1) {
            int a = Q.poll();
            int b = Q.poll();
            ans += a + b;
            Q.add(a + b);
        }
        return ans;
    }
}
