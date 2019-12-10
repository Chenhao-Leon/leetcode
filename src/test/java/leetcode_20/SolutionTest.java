package leetcode_20;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isValid() {
        assertTrue(new Solution().isValid("()"));
        assertTrue(new Solution().isValid("()[]{}"));
        assertFalse(new Solution().isValid("(]"));
        assertFalse(new Solution().isValid("([)]"));
        assertTrue(new Solution().isValid("{[]}"));
        assertFalse(new Solution().isValid("]"));
    }
}