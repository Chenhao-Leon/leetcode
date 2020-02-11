package leetcode_47;

import java.util.*;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/2
 * @Description: 全排列 II（顺着全排列Ⅰ的思路，进行剪枝）
 */
class Solution47 {
    private void backtrack(int n,
                          ArrayList<Integer> nums,
                          List<List<Integer>> output,
                          int first) {
        if (first == n)
            output.add(new ArrayList<Integer>(nums));
        for (int i = first; i < n; i++) {
            // 剪枝，即在first的位置上，待交换数字nums[i]是在之前没有交换过
            if(isSwap(first, i, nums)) {
                Collections.swap(nums, first, i);
                backtrack(n, nums, output, first + 1);
                Collections.swap(nums, first, i);
            }
        }
    }

    private boolean isSwap(int s, int index, ArrayList<Integer> nums){
        for(int i = s; i < index; i++){
            if(nums.get(i).intValue() == nums.get(index).intValue())
                return false;
        }
        return true;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> output = new LinkedList();

        ArrayList<Integer> nums_lst = new ArrayList<Integer>();
        for (int num : nums)
            nums_lst.add(num);

        int n = nums.length;
        backtrack(n, nums_lst, output, 0);
        return output;
    }
}
