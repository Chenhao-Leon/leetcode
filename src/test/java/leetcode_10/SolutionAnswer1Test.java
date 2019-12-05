package leetcode_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionAnswer1Test {

    @Test
    public void isMatch() {
        assertTrue(new SolutionAnswer1().isMatch("ab", ".*"));
        assertTrue(new SolutionAnswer1().isMatch("aab", "c*a*b*"));
        assertFalse(new SolutionAnswer1().isMatch("aa", "a"));
        assertTrue(new SolutionAnswer1().isMatch("aa", "a*"));
        assertFalse(new SolutionAnswer1().isMatch("mississippi", "mis*is*p*."));
        assertTrue(new SolutionAnswer1().isMatch("aab", "c*a*b"));
        assertFalse(new SolutionAnswer1().isMatch("ab", ".*c"));
        assertTrue(new SolutionAnswer1().isMatch("a", "."));
        assertFalse(new SolutionAnswer1().isMatch("a", ".*..a*"));

    }
}