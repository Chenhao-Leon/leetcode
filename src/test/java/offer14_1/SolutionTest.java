package offer14_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void cuttingRope() {
        Solution solution = new Solution();
        assertEquals(36, new Solution().cuttingRope(10));
    }
}