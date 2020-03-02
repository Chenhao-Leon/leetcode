package leetcode_215;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findKthLargest() {
        int[] test = {3,2,1,5,6,4};
        Solution s = new Solution();
        s.findKthLargest(test, 2);
        assertEquals(5, test[test.length - 2]);
    }
}