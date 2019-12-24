package leetcode_39;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void combinationSum() {
        List<List<Integer>> ans = new Solution().combinationSum(new int[]{2, 3, 6, 7}, 7);
        for(List<Integer> list : ans)
            System.out.println(list.toString());
        List<List<Integer>> ans1 = new Solution().combinationSum(new int[]{2, 3, 5}, 8);
        for(List<Integer> list : ans1)
            System.out.println(list.toString());
    }
}