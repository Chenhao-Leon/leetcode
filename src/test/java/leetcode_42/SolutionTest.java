package leetcode_42;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void trap() {
        assertEquals(14, new Solution().trap(new int[]{5,2,1,2,1,5}));
        assertEquals(1, new Solution().trap(new int[]{4,2,3}));
        assertEquals(3, new Solution().trap(new int[]{2,1,0,2}));
        assertEquals(6, new Solution().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}