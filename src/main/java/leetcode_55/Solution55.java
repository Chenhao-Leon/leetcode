package leetcode_55;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/6
 * @Description: 跳跃游戏(递归超时)
 */
public class Solution55 {
    private int[] nums;
    private int len;
    public boolean canJump(int[] nums){
        this.nums = nums;
        len = nums.length;
        return backTrack(0);
    }

    private boolean backTrack(int pos){
        if(pos >= len - 1) return true;
        else if(nums[pos] == 0) return false;
        for(int i = nums[pos]; i >= 1; i--){
            if(backTrack(pos + i))
                return true;
        }
        return false;
    }
}
