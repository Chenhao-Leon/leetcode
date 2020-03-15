package leetcode_287;

import java.util.Arrays;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/15
 * @Description: 寻找重复数
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return nums[i];
        }
        return 0;
    }
}
