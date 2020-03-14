package leetcode_347;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void topKFrequent() {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        new Solution().topKFrequent(nums, 10);
    }
}