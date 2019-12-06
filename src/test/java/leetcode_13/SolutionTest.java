package leetcode_13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt() {
        assertEquals(3, new Solution().romanToInt("III"));
        assertEquals(4, new Solution().romanToInt("IV"));
        assertEquals(9, new Solution().romanToInt("IX"));
        assertEquals(58, new Solution().romanToInt("LVIII"));
        assertEquals(1994, new Solution().romanToInt("MCMXCIV"));
    }
}