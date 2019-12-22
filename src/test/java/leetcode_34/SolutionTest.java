package leetcode_34;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void searchRange() {
        assertArrayEquals(new int[]{3, 4}, new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertArrayEquals(new int[]{-1, -1}, new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }
}