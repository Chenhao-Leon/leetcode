package leetcode_1004;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestOnes() {
        int[] test = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(new Solution().longestOnes(test, 3));
    }
}