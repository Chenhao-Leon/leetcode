package leetcode_189;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/28
 * @Description: 旋转数组 思路正确，实现稀碎
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k >= len && k % len == 0)
            return;
        k = k % len;
        if(k == 1 || len % k != 0){
            swapForTimes(nums, k, len, 0);
        } else{
            for(int i = 0; i < k; i++){
                swapForTimes(nums, k, len / 2, i);
            }
        }
    }
    private void swapForTimes(int[] nums, int increase, int count, int start) {
        int pre = nums[start];
        int index = start;
        for(int i = 0; i < count; i++){
            index = (index + increase) % nums.length;
            int tmp = nums[index];
            nums[index] = pre;
            pre = tmp;
        }
    }
}
