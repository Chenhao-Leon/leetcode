package leetcode_70;

import leetcode_45.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution70_2Test {

    @Test
    public void climbStairs() {
        assertEquals(2, new Solution70_2().climbStairs(2));
        assertEquals(3, new Solution70_2().climbStairs(3));
    }
}