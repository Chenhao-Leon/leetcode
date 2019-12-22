package leetcode_33;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void search() {
        assertEquals(-1, new Solution().search(new int[]{1}, 0));
        assertEquals(4, new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));

    }
}