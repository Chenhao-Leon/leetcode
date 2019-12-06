package leetcode_11;

import leetcode_10.SolutionAnswer2;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxArea() {
//        assertEquals(49, new Solution().maxArea(new int[]{1, 8, 6, 2,5, 4, 8, 3, 7}));
        assertEquals(25, new Solution().maxArea(new int[]{10,9,8,7,6,5,4,3,2,1}));
    }
}