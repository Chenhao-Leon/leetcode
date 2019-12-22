package leetcode_35;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/22
 * @Description: 搜索插入位置
 */
public class Solution {
    public int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while(left <= right){
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
            mid = (right + left) / 2;
        }
        return left;
    }
}
