package offer61;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author chenhao96
 * @description
 * @date 2020/8/14
 */
public class SolutionTest {

    @Test
    public void isStraight() {
        assertEquals(true, new Solution().isStraight(new int[]{0,0,8,5,4}));
        assertEquals(true, new Solution().isStraight(new int[]{1,2,3,4,5}));
        assertEquals(false, new Solution().isStraight(new int[]{11,8,12,8,10}));
        assertEquals(true, new Solution().isStraight(new int[]{0,0,1,2,5}));
    }
}