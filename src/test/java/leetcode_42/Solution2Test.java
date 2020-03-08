package leetcode_42;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void trap() {
        assertEquals(6, new Solution2().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        assertEquals(6, new Solution2().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}