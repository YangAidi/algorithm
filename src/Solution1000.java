/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-03 13:32
 **/
class Solution1000 {
    public int maxProfit(int[] prices, int fee) {
        int sold = 0;
        int hold = -prices[0];
        // sold表示到这一天卖掉的最大收益，hold表示持有到这一天的最大收益
        for (int i = 1; i < prices.length; i++) {
            int t = sold;
            sold = Math.max(sold, hold + prices[i] - fee);

            // 昨天就卖掉了 hold + prices[i] - fee < sold
            hold = Math.max(hold, sold - prices[i]);

            // 今天才卖掉 hold + prices[i] - fee > sold
            hold = Math.max(hold, sold+ prices[i] - fee - prices[i]);
        }
        return sold;
    }
}
