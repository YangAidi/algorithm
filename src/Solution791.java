import java.util.Arrays;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-02-25 17:27
 *
 * WA，不知道什么原因
 **/
public class Solution791 {
    /**
     * @param numbers: the numbers
     * @return: the minimum cost
     */
    public int mergeNumber(int[] numbers) {
        int n = numbers.length;
        Arrays.sort(numbers);
        int time = 0;
        int[] res = new int[n];
        int sum = 0;
        int i = 0;
        int j1 = 0;
        int j2 = -1;
        while (++time < n) {
            int k = 0;
            int sum1 = i < n - 1 ? numbers[i] + numbers[i + 1] : Integer.MAX_VALUE;
            int sum2 = j2 > j1 ? res[j2] + res[j1] : Integer.MAX_VALUE;
            int sum3 = i < n && j2 >= j1 ? res[j1] + numbers[i] : Integer.MAX_VALUE;
            if (sum1 <= sum2 && sum1 <= sum3) {
                //sum1
                k = sum1;
                i = i + 2;
            }
            else if (sum2 < sum3) {
                //sum2
                k = sum2;
                j1 = j1 + 2;
            }
            else{
                //sum3
                k = sum3;
                ++j1;
                ++i;
            }
            sum += k;
            res[++j2] = k;
        }
        return sum;
    }
}
