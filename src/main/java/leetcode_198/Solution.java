package leetcode_198;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/29
 * @Description: 打家劫舍 时间100%
 */
public class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int beBefore = i - 3 >= 0? dp[i - 3]: 0;
            int before = i - 2 >= 0? dp[i - 2]: 0;
            dp[i] = Math.max(beBefore, before) + nums[i];
            if(max < dp[i]) max = dp[i];
        }
        return max;
    }
}
