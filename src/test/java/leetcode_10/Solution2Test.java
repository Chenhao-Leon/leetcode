package leetcode_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void isMatch() {
        assertTrue(new Solution2().isMatch("ab", ".*"));
        assertTrue(new Solution2().isMatch("aab", "c*a*b*"));
        assertFalse(new Solution2().isMatch("aa", "a"));
        assertTrue(new Solution2().isMatch("aa", "a*"));
        assertFalse(new Solution2().isMatch("mississippi", "mis*is*p*."));
        assertTrue(new Solution2().isMatch("aab", "c*a*b"));
        assertFalse(new Solution2().isMatch("ab", ".*c"));
        assertTrue(new Solution2().isMatch("a", "."));
        assertFalse(new Solution2().isMatch("a", ".*..a*"));

    }
}