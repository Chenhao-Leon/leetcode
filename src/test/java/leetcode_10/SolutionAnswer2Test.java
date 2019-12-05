package leetcode_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionAnswer2Test {

    @Test
    public void isMatch() {
        assertTrue(new SolutionAnswer2().isMatch("ab", ".*"));
        assertTrue(new SolutionAnswer2().isMatch("aab", "c*a*b*"));
        assertFalse(new SolutionAnswer2().isMatch("aa", "a"));
        assertTrue(new SolutionAnswer2().isMatch("aa", "a*"));
        assertFalse(new SolutionAnswer2().isMatch("mississippi", "mis*is*p*."));
        assertTrue(new SolutionAnswer2().isMatch("aab", "c*a*b"));
        assertFalse(new SolutionAnswer2().isMatch("ab", ".*c"));
        assertTrue(new SolutionAnswer2().isMatch("a", "."));
        assertFalse(new SolutionAnswer2().isMatch("a", ".*..a*"));

    }
}