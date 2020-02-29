package leetcode_198;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rob() {
        assertEquals(4, new Solution().rob(new int[]{1,2,3,1}));
        assertEquals(4, new Solution().rob(new int[]{2,1,1,2}));
    }
}