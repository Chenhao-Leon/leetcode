package leetcode_33;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/22
 * @Description: 搜索旋转排序数组(二分法)，但用时相同
 */
public class Answer {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while(left <= right) {
            if(nums[mid] == target)
                return mid;
            //mid以左升序
            if(nums[left] <= nums[mid]){
                if(nums[mid] >= target && nums[left] <= target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            //mid以右升序
            else{
                if(nums[mid] <= target && nums[nums.length - 1] >= target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            mid = (left + right) / 2;
        }
        return -1;
    }
}
