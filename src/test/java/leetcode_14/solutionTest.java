package leetcode_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class solutionTest {

    @Test
    public void longestCommonPrefix() {
        assertEquals("fl", new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", new Solution().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}