package leetcode_44;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isMatch() {
        assertFalse(new Solution().isMatch("aa", "a"));
        assertTrue(new Solution().isMatch("aa", "*"));
        assertFalse(new Solution().isMatch("cb", "?a"));
        assertTrue(new Solution().isMatch("adceb", "*a*b"));
        assertFalse(new Solution().isMatch("acdcb", "a*c?b"));
    }
}