package leetcode_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        int r1 = Solution.lengthOfLongestSubstring(s1);
        int r2 = Solution.lengthOfLongestSubstring(s2);
        int r3 = Solution.lengthOfLongestSubstring(s3);
        assertEquals(3, r1);
        assertEquals(1, r2);
        assertEquals(3, r3);
    }
}