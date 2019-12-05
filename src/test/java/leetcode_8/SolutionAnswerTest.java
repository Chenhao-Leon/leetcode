package leetcode_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionAnswerTest {

    @Test
    public void isPalindrome() {
        assertFalse(new SolutionAnswer().isPalindrome(-121));
        assertTrue(new SolutionAnswer().isPalindrome(121));
        assertFalse(new SolutionAnswer().isPalindrome(10));

    }
}