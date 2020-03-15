package leetcode_209;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minSubArrayLen() {
//        assertEquals(3, new Solution().minSubArrayLen(11, new int[]{1,2,3,4,5}));
        assertEquals(2, new Solution().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}