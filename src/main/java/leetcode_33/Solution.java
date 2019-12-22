package leetcode_33;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/22
 * @Description: 搜索旋转排序数组(not logN)
 */
public class Solution {
    public int search (int[] nums, int target) {
        int len = nums.length;
        if(len == 0) return -1;
        int i = 0;
        int j = len - 1;
        if(target < nums[i] && target > nums[j])
            return -1;
        else if(target <= nums[j]){
            while(j >= 0 && target < nums[j]) {
                j--;
                if(j - 1 >= 0 && nums[j - 1] > nums[j])
                    break;
            }
            if(j >= 0 && target == nums[j]) return j;
            else return -1;
        }
        else{
            while(i <= len - 1 && target > nums[i]) {
                i++;
                if(i + 1 <= len - 1 && nums[i + 1] < nums[i])
                    break;
            }
            if(i <= len - 1 && target == nums[i]) return i;
            else return -1;
        }
    }
}
