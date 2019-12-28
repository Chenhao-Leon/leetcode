package leetcode_45;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void jump() {
        assertEquals(1, new Solution().jump(new int[]{2,1}));
        assertEquals(2, new Solution().jump(new int[]{2,3,0,1,4}));
        assertEquals(2, new Solution().jump(new int[]{2, 3, 1, 1, 4}));
    }
}