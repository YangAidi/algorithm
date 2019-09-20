import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-25 16:34
 * 汉诺塔这个可是身经百战了，科宇复试的题目。五分钟AC
 **/
public class Solution169 {
    /**
     * @param n: the number of disks
     * @return: the order of moves
     */
    public List<String> towerOfHanoi(int n) {
        // write your code here
        List l = new ArrayList();
        hanoi("A", "C", "B", n, l);

        return l;
    }

    public void hanoi(String A, String C, String B, int n, List l) {
        if (n == 1)
            l.add("from " + A + " to " + C);
        else {
            hanoi(A, B, C, n - 1, l);
            l.add("from " + A + " to " + C);
            hanoi(B, C, A, n - 1, l);
        }
    }
}
