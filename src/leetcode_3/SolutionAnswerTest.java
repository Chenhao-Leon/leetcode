package leetcode_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionAnswerTest {

    @Test
    public void lengthOfLongestSubstring() {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        //SolutionAnswer.java 17行若写为i = map.get(s.charAt(j))，下面用例出错
        String s4 = "abba";
        assertEquals(3, SolutionAnswer.lengthOfLongestSubstring(s1));
        assertEquals(1, SolutionAnswer.lengthOfLongestSubstring(s2));
        assertEquals(3, SolutionAnswer.lengthOfLongestSubstring(s3));
        assertEquals(2, SolutionAnswer.lengthOfLongestSubstring(s4));
    }
}