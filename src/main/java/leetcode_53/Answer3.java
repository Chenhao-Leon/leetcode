package leetcode_53;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/25
 * @Description: 最简单方法
 */
class Answer3 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
