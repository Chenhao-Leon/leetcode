package leetcode_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        assertEquals(3, Solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, Solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, Solution.lengthOfLongestSubstring("pwwkew"));
    }
}