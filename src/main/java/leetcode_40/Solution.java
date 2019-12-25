package leetcode_40;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/25
 * @Description: 组合总和 II
 */
public class Solution {
    private List<List<Integer>> ans = new LinkedList<>();
    private LinkedList<Integer> now = new LinkedList<>();
    private int[] candidates;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        backTrack(0, target);
        return ans;
    }

    private void backTrack(int index, int target){
        if(target == 0){
            if(!exists(now))
                ans.add((LinkedList)now.clone());
            return;
        }
        for(int i = index; i < candidates.length && candidates[i] <= target; i++){
            now.add(candidates[i]);
            backTrack(i + 1, target - candidates[i]);
            now.removeLast();
        }
    }

    private boolean equals(List<Integer> list1, List<Integer> list2) {
        for(int i = 0; i < list1.size(); i++){
            if(!list1.get(i).equals(list2.get(i)))
                return false;
        }
        return list1.size() == list2.size();
    }

    private boolean exists(List<Integer> l) {
        for(List<Integer> list : ans){
            if(equals(l, list))
                return true;
        }
        return false;
    }
}
