package leetcode_45;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/28
 * @Description: 跳跃游戏 II
 */
public class Solution {
    public int jump(int[] nums) {
        int[] jump = new int[nums.length];
        jump[nums.length - 1] = 0;
        for(int i = nums.length - 2; i >= 0; i--){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= nums[i] && i + j < nums.length; j++){
                if(jump[i + j] != Integer.MAX_VALUE)
                    min = Math.min(min, jump[i + j] + 1);
            }
            jump[i] = min;
        }
        return jump[0];
    }
}
