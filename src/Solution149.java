/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-12 12:44
 **/
public class Solution149 {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length<2){
            return 0;
        }

        int max = prices[prices.length-1];
        int res =0;

        for(int i=prices.length-2;i>=0;--i){
            max = Math.max(prices[i],max);
            res = Math.max(res,max-prices[i]);
        }
        return res;
    }
}
