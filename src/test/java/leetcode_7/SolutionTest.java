package leetcode_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverse() {
        assertEquals(321, new Solution().reverse(123));
        assertEquals(-321, new Solution().reverse(-123));
        assertEquals(21, new Solution().reverse(120));
        assertEquals(0, new Solution().reverse(1534236469));
    }
}