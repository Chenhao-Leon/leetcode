package leetcode_26;

import java.util.HashMap;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/17
 * @Description: 删除排序数组中的重复项
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int pre = nums[0];
        int len = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != pre){
                pre = nums[i];
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
