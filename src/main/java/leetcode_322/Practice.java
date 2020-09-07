package leetcode_322;

import java.util.Arrays;

/**
 * @Auther: Chen Hao
 * @Date: 2020/9/7
 * @Description:
 */
public class Practice {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0 ; i < coins.length; i++) {
            if (coins[i] <= amount)
                dp[coins[i]] = 1;
        }
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                int index = i - coins[j];
                if (index >= 0 && dp[index] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[index] + 1);
                }
            }
        }
        return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;
    }
}
