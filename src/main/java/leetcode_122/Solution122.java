package leetcode_122;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/17
 * @Description: 买卖股票的最佳时机 II
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 0) return 0;
        int buyIn = prices[0];
        boolean hasStock = false;
        int profit = 0;
        for(int i = 0; i < len; i++){
            if(i != len - 1 && prices[i + 1] > prices[i] && !hasStock) {
                buyIn = prices[i];
                hasStock = true;
            }
            else if((i != len - 1 && prices[i + 1] < prices[i] && hasStock) || (i == len - 1 && hasStock)) {
                profit += prices[i] - buyIn;
                hasStock = false;
            }
        }
        return profit;
    }
}
