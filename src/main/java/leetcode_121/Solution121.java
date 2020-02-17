package leetcode_121;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/17
 * @Description: 买卖股票的最佳时机
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 0) return 0;
        int[] maxArray = new int[len];
        maxArray[len - 1] = prices[len - 1];
        for(int i = len - 2; i >= 0; i--)
            maxArray[i] = Math.max(prices[i], maxArray[i + 1]);
        int profit = 0;
        for(int i = 0; i < len - 1; i++) {
            if (maxArray[i] > prices[i])
                profit = Math.max(profit, maxArray[i] - prices[i]);
        }
        return profit;
    }
}
