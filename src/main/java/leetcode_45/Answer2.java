package leetcode_45;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/28
 * @Description:
 */
public class Answer2 {
    public int jump(int[] nums) {
        int end = 0;
        //maxPosition是在i<=index<=end范围内再跳一步可以达到的最远位置
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < nums.length - 1; i++){
            //找能跳的最远的
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if( i == end){ //遇到边界，就更新边界，并且步数加一
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(new Answer2().jump(new int[]{2,3,1,1,4}));
    }
}
