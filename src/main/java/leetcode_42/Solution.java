package leetcode_42;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/26
 * @Description: 接雨水(暴力解法 超时)
 */
public class Solution {
    public int trap(int[] height) {
        int highest = 0;
        for(int temp : height)
            highest = Math.max(highest, temp);
        int start = 0;
        int waterSum = 0;
        int level= 1;
        while(level <= highest){
            int count = 0;
            for(int i = 0; i < height.length; i++){
                if((height[i] >= level && count == 0) || (i >= 1 && height[i - 1] >= level && height[i] >= level)){
                    start = i;
                    count = 1;
                }
                else if(height[i] >= level && count == 1){
                    waterSum += i - start - 1;
                    if(i + 1 < height.length && height[i + 1] < level){
                        count = 1;
                        start = i;
                    }
                    else
                        count = 0;
                }
            }
            level++;
        }
        return waterSum;
    }
}
