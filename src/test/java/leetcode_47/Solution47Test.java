package leetcode_47;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution47Test {

    @Test
    public void permuteUnique() {
        List<List<Integer>> res = new Solution47().permuteUnique(new int[]{2,2,1,1});
        for(List<Integer> list : res)
            System.out.println(list);
    }
}