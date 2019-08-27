
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-25 16:05
 **/
public class Solution1002 {
    /**
     * @param routes: a list of bus routes
     * @param s:      start
     * @param t:      destination
     * @return: the least number of buses we must take to reach destination
     */
    public int numBusesToDestination(int[][] routes, int s, int t) {
        // Write your code here
        if (s == t) {
            return 0;
        }
        boolean[] visit = new boolean[1000];
        boolean[][] path = new boolean[1000][1000];

        int row = routes.length;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < routes[i].length; ++j) {
                int now = routes[i][j];
                int pre = routes[i][j == 0 ? routes[i].length - 1 : j - 1];
                path[now][pre] = true;
                path[pre][now] = true;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);

        int count = 1;
        visit[s] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int n = 0; n < size && !queue.isEmpty(); ++n) {
                int now = queue.poll();
                for (int i = 1; i < 1000; ++i) {
                    if (path[i][now] && !visit[i]) {
                        if (i == t) {
                            return count;
                        }
                        visit[i] = true;
                        queue.add(i);
                    }
                }
            }
            ++count;
        }

        return -1;
    }
}
