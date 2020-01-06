package leetcode_55;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/6
 * @Description: 跳跃游戏 defeat 62%
 * 简单易理解
 */
public class Answer1 {
    public boolean canJump(int[] nums){
        int maxPos = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxPos) return false;
            maxPos = Math.max(maxPos, i + nums[i]);
        }
        return true;
    }
}
