package leetcode_63;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution63Test {

    @Test
    public void uniquePaths() {
        int[][] test1 = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
        };
        assertEquals(2, new Solution63().uniquePaths(test1));
    }
}