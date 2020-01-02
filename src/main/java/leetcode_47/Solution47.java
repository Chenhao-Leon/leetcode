package leetcode_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/2
 * @Description: 全排列 II
 * 29、30两个用例没有通过
 */
public class Solution47 {
    private List<Integer> list = new ArrayList<>();
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        for(int a : nums)
            list.add(a);
        backTrack(0, nums.length - 1);
        return res;
    }

    private void backTrack(int start, int end){
        if(start == end){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < list.size(); i++){
            // 剪枝
            if(i != start && (list.get(i - 1).equals(list.get(i)) || list.get(start).equals(list.get(i))))
                continue;
            Collections.swap(list, i, start);
            backTrack(start + 1, end);
            Collections.swap(list, i, start);
        }
    }
}
