package leetcode_11;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/6
 * @Description: 盛最多水的容器
 */
public class SolutionAnswer {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            if(height[i] < height[j]) i++;
            else j--;
        }
        return max;
    }
}
