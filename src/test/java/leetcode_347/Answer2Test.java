package leetcode_347;

import org.junit.Test;

import static org.junit.Assert.*;

public class Answer2Test {

    @Test
    public void topKFrequent() {
        int[] nums = {1,1,1,2,2,3};
        new Answer2().topKFrequent(nums, 2);
    }
}