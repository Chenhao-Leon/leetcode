package leetcode_152;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProduct() {
        assertEquals(108, new Solution().maxProduct(new int[]{-1,-2,-9,-6}));
        assertEquals(24, new Solution().maxProduct(new int[]{-2,3,-4}));
        assertEquals(6, new Solution().maxProduct(new int[]{2,3,-2,4}));
        assertEquals(0, new Solution().maxProduct(new int[]{-2,0,-1}));
    }
}