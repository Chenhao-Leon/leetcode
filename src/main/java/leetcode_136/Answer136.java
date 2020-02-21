package leetcode_136;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/21
 * @Description: 只出现一次的数字 异或
 */
public class Answer136 {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        if(nums.length > 1){
            for(int i = 1; i < nums.length; i++)
                ans = ans ^ nums[i];
        }
        return ans;
    }
}
