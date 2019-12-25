package leetcode_40;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/25
 * @Description: 组合总和 II
 */
public class Answer {
    private List<List<Integer>> ans = new LinkedList<>();
    private LinkedList<Integer> now = new LinkedList<>();
    private int[] candidates;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        backTrack(0, target);
        return ans;
    }

    private void backTrack(int index, int target) {
        if (target == 0) {
            ans.add(new LinkedList<>(now));
            return;
        }
        for (int i = index; i < candidates.length && candidates[i] <= target; i++) {
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            now.add(candidates[i]);
            backTrack(i + 1, target - candidates[i]);
            now.removeLast();
        }
    }
}
