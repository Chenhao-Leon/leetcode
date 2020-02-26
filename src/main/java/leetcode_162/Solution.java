package leetcode_162;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/26
 * @Description: 寻找峰值 二分查找
 * 原理：当nums[mid] > nums[mid + 1]时，mid和mid+1是降序，mid以左（包括mid）至少出现一个峰值，
 * 因为它要么一直递减，那么峰值就是nums[0]；要么就是有若干折线（峰值）。
 * 当nums[mid] < nums[mid + 1]时也同理。
 */
public class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
