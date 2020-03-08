package leetcode_42;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/8
 * @Description: 未通过
 */
public class Solution2 {
    public int trap(int[] height) {
        int res = 0;
        for (int right = 0; right < height.length; ) {
            int left = right + 1;
            int sum = 0;
            while (left < height.length && height[left] < height[right]) {
                sum += height[right] - height[left++];
            }
            if (left < height.length && height[left] >= height[right]) {
                res += sum;
                right = left;
            } else
                right++;
        }
        return res;
    }
}
