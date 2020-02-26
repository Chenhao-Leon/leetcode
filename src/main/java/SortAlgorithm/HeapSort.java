package SortAlgorithm;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/26
 * @Description: 堆排序（大根堆）
 */
public class HeapSort {
    public void heapSort(int[] nums){
        int len = nums.length;
        for(int i = len / 2 - 1; i >= 0; i--)
            adjustHeap(nums, i, len - 1);
        for(int i = len - 1; i >= 0; i--){
            swap(nums, 0, i);
            adjustHeap(nums, 0, i - 1);
        }
    }
    private void adjustHeap(int[] nums, int s, int e){
        int i = s;
        while(2 * i + 1 <= e){
            int min;
            if(2 * i + 2 <= e)
                min = nums[2 * i + 1] < nums[2 * i + 2]? 2 * i + 2: 2 * i + 1;
            else min = 2 * i + 1;
            if(nums[i] < nums[min])
                swap(nums, min, i);
            else
                break;
            i = min;
        }
    }
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
