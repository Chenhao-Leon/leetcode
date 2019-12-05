package leetcode_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isMatch() {
        assertTrue(new Solution().isMatch("ab", ".*"));
        assertTrue(new Solution().isMatch("aab", "c*a*b*"));
        assertFalse(new Solution().isMatch("aa", "a"));
        assertTrue(new Solution().isMatch("aa", "a*"));
        assertFalse(new Solution().isMatch("mississippi", "mis*is*p*."));
        assertTrue(new Solution().isMatch("aab", "c*a*b"));
        assertFalse(new Solution().isMatch("ab", ".*c"));
        assertTrue(new Solution().isMatch("a", "."));
        assertFalse(new Solution().isMatch("a", ".*..a*"));
    }
}