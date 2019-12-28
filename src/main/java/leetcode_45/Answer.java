package leetcode_45;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/28
 * @Description: 跳跃游戏 II(根据贪婪算法自己码的）
 */
public class Answer {
    public int jump(int[] nums) {
        int jump = 0;
        int now = 0;
        while(now < nums.length - 1){
            int far = 0;
            int index = Integer.MAX_VALUE;
            for(int i = 1; i <= nums[now]; i++){
                if(now + i == nums.length - 1){
                    jump++;
                    return jump;
                }
                if(nums[now + i] + i > far){
                    far = nums[now + i] + i;
                    index = now + i;
                }
            }
            now = index;
            jump ++;
        }
        return jump;
    }
}
