package leetcode_209;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/15
 * @Description: 长度最小的子数组 时间89%
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;
        int p = 0;
        int q = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while(p <= q){
            if(sum < s){
                if(q >= nums.length) break;
                sum += nums[q++];
            } else {
                minLen = Math.min(minLen, q - p);
                sum -= nums[p++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
