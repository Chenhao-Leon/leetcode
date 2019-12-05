package leetcode_9;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        assertFalse(new Solution().isPalindrome(-121));
        assertTrue(new Solution().isPalindrome(121));
        assertFalse(new Solution().isPalindrome(10));
    }
}