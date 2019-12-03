package leetcode_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionAnswer1Test {

    @Test
    public void longestPalindrome() {
        assertEquals("", new SolutionAnswer1().longestPalindrome(""));
        assertEquals("aba", new SolutionAnswer1().longestPalindrome("babad"));
        assertEquals("bb", new SolutionAnswer1().longestPalindrome("cbbd"));
    }
}