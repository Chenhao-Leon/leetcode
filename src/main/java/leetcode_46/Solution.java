package leetcode_46;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/7
 * @Description: 全排列
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums, 0, res);
        return res;
    }
    private void backTrack(int[] nums, int start, List<List<Integer>> res){
        if(start == nums.length){
            ArrayList<Integer> array = new ArrayList<>();
            for(int tmp : nums)
                array.add(tmp);
            res.add(array);
            return;
        }
        for(int i = start; i < nums.length; i++){
            swap(nums, start, i);
            backTrack(nums, start + 1, res);
            swap(nums, start, i);
        }
    }
    private void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
