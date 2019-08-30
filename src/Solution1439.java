/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-30 17:12
 **/
class Solution1439 {
    public int consecutiveNumbersSum(int N) {
        int count = 1;
        for(int k = 2; k < Math.sqrt(2 * N); k++) {
            // k表示子段长度，如果减去某个子段的长度k，1~k之和，的差是k的倍数，就表示可以由k长度的子段组成
            if ((N - (k * (k - 1) / 2)) % k == 0) {
                count++;
            }
        }
        return count;
    }
}
