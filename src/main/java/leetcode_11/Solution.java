package leetcode_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/6
 * @Description: 盛最多水的容器
 */
// 超时
public class Solution {
    public int maxArea(int[] height){
        LinkedList<Integer> queue_left = new LinkedList<>();
        queue_left.add(Math.min(height[0], height[1]));
        int down = -1;
        int max = Math.min(height[0], height[1]);
        for(int j = 2; j < height.length; j++)
            for(int i = j - 1; i >= 0; i--){
                if(j - 1 == i){
                    down = Math.min(height[i], height[j]);
                    queue_left.add(down);
                }
                else{
                    int left = queue_left.pop();
                    max = Math.max(down,
                            Math.max(left, (j - i) * Math.min(height[i], height[j])));
                    queue_left.add(max);
                    down = max;
                }
            }
        return max;
    }
}
