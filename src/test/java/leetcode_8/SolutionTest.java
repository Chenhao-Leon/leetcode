package leetcode_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void myAtoi() {
//        assertEquals(42, new Solution().myAtoi("42"));
//        assertEquals(-42, new Solution().myAtoi("-42"));
//        assertEquals(4193, new Solution().myAtoi("4193 with words"));
//        assertEquals(0, new Solution().myAtoi("words and 987"));
        assertEquals(-2147483648, new Solution().myAtoi("-91283472332"));
    }
}