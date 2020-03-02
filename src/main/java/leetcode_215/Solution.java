package leetcode_215;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/2
 * @Description: 数组中的第K个最大元素
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        heapSortK(nums, k);
        return nums[nums.length - k];
    }
    private void heapSortK(int[] nums, int k){
        for(int i = nums.length / 2 - 1; i >= 0; i--)
            adjust(nums, i, nums.length - 1);
        for(int i = nums.length - 1; i >= nums.length - k; i--){
            swap(nums, 0, i);
            adjust(nums, 0, i - 1);
        }
    }
    private void adjust(int[] nums, int s, int e){
        int i = s;
        while(i * 2 + 1 <= e){
            int maxIndex = 2 * i + 1;
            if(i * 2 + 2 <= e)
                maxIndex = nums[2 * i + 1] < nums[2 * i + 2]? 2 * i + 2: 2 * i + 1;
            if(nums[maxIndex] > nums[i])
                swap(nums, maxIndex, i);
            else break;
            i = maxIndex;
        }
    }
    private void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
