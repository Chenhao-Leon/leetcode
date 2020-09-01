package others;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/26
 * @Description: 归并排序
 */
public class MergeSort {
    private int[] array;
    private void backTrack(int[] nums, int left, int right){
        if(left == right)
            return;
        int mid = (left + right) / 2;
        backTrack(nums, left, mid);
        backTrack(nums, mid + 1, right);
        int index = 0;
        int p1 = left, p2 = mid + 1;
        while(p1 <= mid  && p2 <= right){
            array[index++] = nums[p1] < nums[p2] ? nums[p1++] : nums[p2++];
        }
        while(p1 <= mid)
            array[index++] = nums[p1++];
        while(p2 <= right)
            array[index++] = nums[p2++];
        for(int i = 0; i < index; i++)
            nums[left + i] = array[i];
    }
    public void mergeSort(int[] nums){
        array = new int[nums.length];
        backTrack(nums, 0, nums.length - 1);
    }
}
