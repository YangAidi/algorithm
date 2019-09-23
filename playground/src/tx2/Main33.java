package tx2;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 21:42
 **/

import java.util.*;

import java.util.Scanner;

public class Main33 {

    private static int[][] cache;

    private static int dfs(int[] people, int start, int target) {
        if (start == people.length) {
            return 0;
        } else if (target < 0) {
            return Integer.MIN_VALUE;
        } else {
            if (cache[start][target] != -1) {
                return cache[start][target];
            } else {
                if (target < people[start]) {
                    cache[start][target] = dfs(people, start + 1, target);
                } else {
                    cache[start][target] = Math.max(dfs(people, start + 1, target), dfs(people, start + 1, target - people[start]) + people[start]);
                }
                return cache[start][target];
            }
        }
    }

    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            int k = in.nextInt();
            for (int qcount = 0; qcount < k; qcount++) {
                int n = in.nextInt();
                int[] people = new int[n];
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    people[i] = in.nextInt();
                    sum += people[i];
                }
                int half = sum / 2;
                cache = new int[n][sum];
                for (int i = 0; i < n; i++) {
                    Arrays.fill(cache[i], -1);
                }
                int less = dfs(people, 0, half);
                System.out.println(less + " " + (sum - less));
            }
        }
    }
}
