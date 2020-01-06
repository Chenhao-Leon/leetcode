package leetcode_55;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution55Test {

    @Test
    public void canJump() {
        assertTrue(new Solution55().canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(new Solution55().canJump(new int[]{3, 2, 1, 0, 4}));
    }
}