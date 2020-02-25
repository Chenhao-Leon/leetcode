package leetcode_150;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void evalRPN() {
        String[] strings = new String[]{"2", "1", "+", "3", "*"};
        assertEquals(9, new Solution().evalRPN(strings));
    }
}