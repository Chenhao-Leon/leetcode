package leetcode_215;

public class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        heapSortK(nums, k);
        return nums[nums.length - k];
    }

    private void heapSortK(int[] nums, int k) {
        for(int i = nums.length / 2 - 1; i >= 0; i--)
            adjust(nums, i, nums.length - 1);
        for(int i = 0; i < k; i++) {
            swap(nums, 0, nums.length - i - 1);
            adjust(nums, 0, nums.length - i - 2);
        }
    }

    private void swap(int[] nums, int indexA, int indexB) {
        int tmp = nums[indexA];
        nums[indexA] = nums[indexB];
        nums[indexB] = tmp;
    }

    private void adjust(int[] nums, int start, int end) {
        int index = start;
        while(index < end) {
            if(2 * index + 1 > end)
                break;
            int maxIndex = nums[index] < nums[2 * index + 1] ? 2 * index + 1 : index;
            if(2 * index + 2 <= end)
                maxIndex = nums[maxIndex] < nums[2 * index + 2] ? 2 * index + 2 : maxIndex;
            if(maxIndex != index)
                swap(nums, index, maxIndex);
            else
                break;
            index = maxIndex;
        }
    }
}
