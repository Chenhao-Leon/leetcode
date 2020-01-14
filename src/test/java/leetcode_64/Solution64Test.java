package leetcode_64;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution64Test {

    @Test
    public void minPathSum() {
        int[][] test1 = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1},
        };
        assertEquals(7, new Solution64().minPathSum(test1));
    }
}