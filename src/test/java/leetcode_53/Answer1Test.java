package leetcode_53;

import org.junit.Test;

import static org.junit.Assert.*;

public class Answer1Test {

    @Test
    public void maxSubArray() {
        assertEquals(6, new Answer1().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}