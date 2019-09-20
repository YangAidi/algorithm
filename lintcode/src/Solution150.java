/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-16 17:01
 **/
public class Solution150 {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length<1){
            return 0;
        }

        int sale = 0;
        int hold = -prices[0];
        for (int i = 1; i < prices.length; ++i) {
            int temp = hold;
            hold = Math.max(sale - prices[i], hold);
            sale = Math.max(temp + prices[i], sale);
        }
        return sale < 0 ? 0 : sale;
    }
}
