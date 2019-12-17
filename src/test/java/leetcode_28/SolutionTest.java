package leetcode_28;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void strStr() {
        assertEquals(2, new Solution().strStr("hello", "ll"));
        assertEquals(-1, new Solution().strStr("aaaaa", "bba"));
    }
}