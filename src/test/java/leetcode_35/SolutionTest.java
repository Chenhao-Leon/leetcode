package leetcode_35;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void searchInsert() {
        assertEquals(2, new Solution().searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, new Solution().searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, new Solution().searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, new Solution().searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}