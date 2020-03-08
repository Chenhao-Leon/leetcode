package leetcode_322;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void coinChange() {
        assertEquals(4, new Solution().coinChange(new int[]{2,5,10,1},27));
        assertEquals(3, new Solution().coinChange(new int[]{1,2,5},11));
        assertEquals(-1, new Solution().coinChange(new int[]{2}, 3));
    }
}