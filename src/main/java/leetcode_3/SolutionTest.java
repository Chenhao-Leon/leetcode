package leetcode_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        assertEquals(3, Solution.lengthOfLongestSubstring(s1));
        assertEquals(1, Solution.lengthOfLongestSubstring(s2));
        assertEquals(3, Solution.lengthOfLongestSubstring(s3));
    }
}