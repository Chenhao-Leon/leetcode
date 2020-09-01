package offer42;

/**
 * @author chenhao96
 * @description
 * @date 2020/8/16
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) dp[0] = nums[0];
            else {
                dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
