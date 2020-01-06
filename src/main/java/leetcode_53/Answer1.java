package leetcode_53;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/5
 * @Description: 最大子序和(贪婪算法)
 */
public class Answer1 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];

        for(int i = 1; i < n; ++i) {
            //currSum表示以i结尾的和最大的子序列，maxSum表示0-i连续子序列的最大和
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
