package leetcode_179;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestNumber() {
        assertEquals("12812", new Solution().largestNumber(new int[]{128,12}));
        assertEquals("9534330", new Solution().largestNumber(new int[]{3,30,34,5,9}));
    }
}