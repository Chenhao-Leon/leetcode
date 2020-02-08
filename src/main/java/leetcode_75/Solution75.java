package leetcode_75;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/8
 * @Description: 颜色分类
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        int redIndex = 0;
        //whiteIndex不能设为1，因为在没有white的情况下redIndex==whiteIndex
        int whiteIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                swap(nums, i, redIndex);
                redIndex++;
                //即redIndex>whiteIndex时不交换，因为此时没有white，只需要直接把whiteIndex+1
                if(redIndex <= whiteIndex)
                    swap(nums, i, whiteIndex);
                whiteIndex++;
            }
            else if(nums[i] == 1){
                swap(nums, i, whiteIndex);
                whiteIndex++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
