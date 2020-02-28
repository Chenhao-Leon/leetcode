package leetcode_189;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rotate() {
        int[] test3 = {1,2};
        new Solution().rotate(test3, 1);
        assertArrayEquals(new int[]{2,1}, test3);
        int[] test1 = {1,2,3,4,5,6,7};
        new Solution().rotate(test1, 3);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, test1);
        int[] test2 = {-1,-100,3,99};
        new Solution().rotate(test2, 2);
        assertArrayEquals(new int[]{3,99,-1,-100}, test2);
    }
}