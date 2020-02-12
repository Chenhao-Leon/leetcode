package leetcode_84;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/12
 * @Description: 柱状图中最大的矩形
 */
public class Solution84 {
    public int largestRectangleArea(int[] heights) {
        int min;
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            min = heights[i];
            for(int j = i; j < heights.length; j++){
                min = Math.min(heights[j], min);
                maxArea = Math.max(maxArea, min * (j - i + 1));
            }
        }
        return maxArea;
    }
}
