package tx2;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 20:35
 **/

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Map<Integer, Integer> people = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int count = in.nextInt(), time = in.nextInt();
            people.put(time, count);
        }
        int[][] counts = new int[m][2];
        Iterator iter = people.keySet().iterator();
        int i = 0, j = 0;

        while (iter.hasNext()) {
            counts[i][0] = (int) iter.next();
            counts[i][1] = (int) people.get(counts[i][0]);
            i++;
        }
        int result = 0;
        for (i = 0, j = m - 1; i <= j; ) {
            result = Math.max(result, counts[i][0] + counts[j][0]);
            counts[i][1]--;
            counts[j][1]--;
            if (counts[i][1] == 0) {
                i++;
            }
            if (counts[j][1] == 0) {
                j--;
            }
        }
        System.out.println(result);
    }
}
