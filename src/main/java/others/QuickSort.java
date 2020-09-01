package others;


/**
 * @Auther: Chen Hao
 * @Date: 2020/2/26
 * @Description: 快速排序
 */
public class QuickSort {
    public void quickSort(int[] nums){
        sort(nums, 0, nums.length - 1);
    }
    private void sort(int[] nums, int left, int right){
        if(left >= right) return;
        int tmp = nums[left];
        int i = left, j = right;
        while(i < j){
            //这里必须是>=
            while(i < j && nums[j] >= tmp)
                j--;
            //这里必须是>=
            while(i < j && nums[i] <= tmp)
                i++;
            if(nums[i] > nums[j])
                swap(nums, i, j);
        }
        swap(nums, left, i);
        sort(nums, left, i - 1);
        sort(nums, i + 1, right);
    }
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
