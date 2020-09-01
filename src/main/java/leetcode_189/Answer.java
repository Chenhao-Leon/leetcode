package leetcode_189;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/28
 * @Description: 反转法，具体方法是：最终k%n个尾部元素会被移动到头部，先将整体反转，在将0-k%n反转，再将剩余元素反转就得到了
 */
public class Answer {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
