package tx;


import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-01 19:59
 **/
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] sum = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        sum[0] = a[0];
        for (int i = 1; i < n; ++i) {
            sum[i] = sum[i - 1] + a[i];
        }
        System.out.println(getMaxSum(a, 0, n - 1, findMin(a, 0, n - 1), sum));
    }

    private static int findMin(int[] a, int left, int right) {
        if (right == a.length - 1) {
            right = a.length - 1;
        }
        if (left < 0) {
            left = 0;
        }
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = left; i <= right; ++i) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int getMaxSum(int[] a, int left, int right, int i, int[] sum) {
        if (left >= right) {
            return a[left]*a[left];
        }
        int leftMin = findMin(a, left, i - 1);
        int rightMin = findMin(a, i + 1, right);
        int min = a[findMin(a, left, right)];
        int middle = min * (sum[right] - sum[left] + a[left]);
        int rightValue = i == right ? 0 : getMaxSum(a, i + 1, right, rightMin, sum);
        int leftValue = i == left ? 0 : getMaxSum(a, left, i - 1, leftMin, sum);
        return Math.max(Math.max(middle, leftValue), rightValue);
    }
}
