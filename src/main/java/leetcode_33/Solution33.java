package leetcode_33;

public class Solution33 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while(left <= right) {
            mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            //[left,right]为升序，正常二分法
            if(nums[left] < nums[right]) {
                if(nums[mid] < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            //[left,right]非升序，特殊处理
            else {
                //nums[mid]处于前半段
                if(nums[mid] >= nums[left]) {
                    //target在mid左侧的情况
                    if(target >= nums[left] && target < nums[mid])
                        right = mid - 1;
                    else left = mid + 1;
                }
                //nums[mid]处于后半段
                else {
                    //target在mid右侧的情况
                    if(target <= nums[right] && target > nums[mid])
                        left = mid + 1;
                    else right = mid - 1;
                }
            }
        }
        return -1;
    }
}
