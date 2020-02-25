package leetcode_152;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/25
 * @Description: 乘积最大子序列 通过167/184个测试用例
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        //计算i之后的负数个数，如果在i后第一个负数之前有0则flag[i]为0
        int[] flag = new int[len];
        flag[len - 1] = 0;
        for(int i = len - 2; i >= 0; i--){
            if(nums[i + 1] < 0 || (flag[i + 1] > 0 && nums[i + 1] != 0))
                flag[i] = flag[i + 1] + 1;
            else flag[i] = 0;
        }
        int max = nums[0];
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for(int i = 0; i < len; i++){
            if(flag[i] > 0){
                if(Math.abs(dp[i] * nums[i]) > Math.abs(nums[i]))
                    dp[i + 1] = dp[i] * nums[i];
                else if(Math.abs(dp[i] * nums[i]) == Math.abs(nums[i])){
                    if(flag[i] % 2 == 0) dp[i + 1] = Math.max(dp[i] * nums[i], nums[i]);
                    else dp[i + 1] = Math.min(dp[i] * nums[i], nums[i]);
                }
                else
                    dp[i + 1] = nums[i];
            } else{
                if(dp[i] * nums[i] > nums[i])
                    dp[i + 1] = dp[i] * nums[i];
                else
                    dp[i + 1] = nums[i];
            }
            max = Math.max(max, dp[i + 1]);
        }
        return max;
    }
}
