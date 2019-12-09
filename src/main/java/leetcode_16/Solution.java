package leetcode_16;

import java.util.Arrays;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/9
 * @Description: 最接近的三数之和
 */
// 类似15题，使用双指针法即可
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int re = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(re - target) > Math.abs(sum - target)) re = sum;
                if(sum < target) j++;
                else if(sum > target) k--;
                else return re;
            }
        }
        return re;
    }
}
