package leetcode_215;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void findKthLargest() {
        int[] nums= {3,2,3,1,2,4,5,5,6};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.findKthLargest(nums, 4));
    }
}