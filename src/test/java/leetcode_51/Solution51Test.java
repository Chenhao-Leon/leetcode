package leetcode_51;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution51Test {

    @Test
    public void solveNQueens() {
        List<List<String>> res = new Solution51().solveNQueens(4);
        for(List<String> temp : res)
            System.out.println(temp);
    }
}