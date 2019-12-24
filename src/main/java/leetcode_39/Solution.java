package leetcode_39;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/24
 * @Description: 组合总和(剪枝回溯)
 */
public class Solution {
    private List<List<Integer>> ans = new LinkedList<>();
    private LinkedList<Integer> now = new LinkedList<>();
    private int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        this.candidates = candidates;
        Arrays.sort(candidates);
        backTrack(0, target);
        return ans;
    }

    private void backTrack(int index, int target){
        if(target == 0) {
            //此处不能写为ans.add(now)。这条语句的本质是把LinkedList最后位置的指针指向now
            //如果写成ans.add(now)，当now改变ans时也会跟着改变
            ans.add((LinkedList<Integer>)now.clone());
            return;
        }
        else if(candidates[index] > target) return;
        for(int i = index; i < candidates.length && candidates[i] <= target; i++){
            now.add(candidates[i]);
            backTrack(i, target - candidates[i]);
            now.removeLast();
        }
    }
}
