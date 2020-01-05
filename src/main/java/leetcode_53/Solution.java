package leetcode_53;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/5
 * @Description: 最大子序和
 */
public class Solution {
    public int maxSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
