package leetcode_43;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void multiply() {
//        assertEquals("6", new Solution().multiply("2", "3"));
        assertEquals("0", new Solution().multiply("9133", "0"));
        assertEquals("56088", new Solution().multiply("123", "456"));
    }
}