package leetcode_172;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void trailingZeroes() {
        assertEquals(7, new Solution().trailingZeroes(30));
        assertEquals(0, new Solution().trailingZeroes(3));
        assertEquals(1, new Solution().trailingZeroes(5));
    }
}