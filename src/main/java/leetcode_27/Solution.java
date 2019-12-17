package leetcode_27;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/17
 * @Description: 移除元素
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val)
                nums[len++] = nums[i];
        }
        return len;
    }
}
