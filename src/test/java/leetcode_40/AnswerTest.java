package leetcode_40;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void combinationSum2() {
        List<List<Integer>> ans = new Answer().combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        for(List<Integer> list : ans)
            System.out.println(list.toString());
        List<List<Integer>> ans1 = new Answer().combinationSum2(new int[]{2,5,2,1,2}, 5);
        for(List<Integer> list : ans1)
            System.out.println(list.toString());
    }
}