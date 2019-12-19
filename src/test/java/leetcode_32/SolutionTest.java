package leetcode_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestValidParentheses() {
        assertEquals(2, new Solution().longestValidParentheses("()(()"));
        assertEquals(2, new Solution().longestValidParentheses("(()"));
        assertEquals(4, new Solution().longestValidParentheses(")()())"));
    }
}