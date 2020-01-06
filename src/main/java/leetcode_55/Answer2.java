package leetcode_55;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/6
 * @Description: 跳跃游戏(官方倒叙贪心) defeat 100%
 */
public class Answer2 {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}
