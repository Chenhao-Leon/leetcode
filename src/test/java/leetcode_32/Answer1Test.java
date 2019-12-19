package leetcode_32;

import leetcode_31.Answer;
import org.junit.Test;

import static org.junit.Assert.*;

public class Answer1Test {

    @Test
    public void longestValidParentheses() {
        assertEquals(2, new Answer1().longestValidParentheses("()(()"));
    }
}