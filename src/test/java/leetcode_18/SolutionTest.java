package leetcode_18;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void fourSum() {
        List<Integer> a1 = Arrays.asList(-1,  0, 0, 1);
        List<Integer> a2 = Arrays.asList(-2, -1, 1, 2);
        List<Integer> a3 = Arrays.asList(-2,  0, 0, 2);
        List<List<Integer>> ans = Arrays.asList(a1, a2, a3);
//        assertEquals(ans, new Solution().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
//        assertEquals(null, new Solution().fourSum(new int[]{0, 0, 0, 0}, 0));
//        assertEquals(null, new Solution().fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0));
        assertEquals(null, new Solution().fourSum(new int[]{-1, -5, -5, -3, 2, 5, 0, 4}, -7));
    }
}