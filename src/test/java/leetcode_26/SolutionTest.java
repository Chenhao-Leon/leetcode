package leetcode_26;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeDuplicates() {
        assertEquals(2, new Solution().removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(5, new Solution().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}