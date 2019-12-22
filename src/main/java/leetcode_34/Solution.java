package leetcode_34;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/22
 * @Description: 在排序数组中查找元素的第一个和最后一个位置
 * 两次二分法，用时击败100%
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftIndex = (left + right) / 2;
        while(left <= right){
            if(nums[leftIndex] == target && (leftIndex - 1 < 0 || nums[leftIndex - 1] < target))
                break;
            if(nums[leftIndex] >= target)
                right = leftIndex - 1;
            else
                left = leftIndex + 1;
            leftIndex = (left + right) / 2;
        }
        if(left > right) leftIndex = -1;
        left = 0;
        right = nums.length - 1;
        int rightIndex = (leftIndex + right) / 2;
        while(left <= right){
            if(nums[rightIndex] == target && (rightIndex + 1 > nums.length - 1 || nums[rightIndex + 1] > target))
                break;
            if(nums[rightIndex] <= target)
                left = rightIndex + 1;
            else
                right = rightIndex - 1;
            rightIndex = (left + right) / 2;
        }
        if(left > right) rightIndex = -1;
        return new int[]{leftIndex, rightIndex};
    }
}
