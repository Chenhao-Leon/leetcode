package leetcode_11;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/6
 * @Description: 盛最多水的容器
 */
// H[i]表示i处的高度，s(i,j)表示(i,j)的面积。双指针法正确性的关键：
// 拿初始状态i=0,j=n-1来说，如果H[0]<H[n-1]，则排除了(0,1)(0,2)...(0,n-2)这些状态。
// 原因在于i=0确定的话，矩形的高最大为H[0]，但长却变小了，所以面积必然没有s(0,n-1)大。
// 这也是双指针法能降低时间复杂度的原因。
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
