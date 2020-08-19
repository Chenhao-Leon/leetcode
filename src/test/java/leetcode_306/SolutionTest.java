package leetcode_306;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author chenhao96
 * @description
 * @date 2020/8/19
 */
public class SolutionTest {

    @Test
    public void isAdditiveNumber() {
        assertEquals(true, new Solution().isAdditiveNumber("112358"));
        assertEquals(true, new Solution().isAdditiveNumber("199100199"));
        assertEquals(false, new Solution().isAdditiveNumber("19910011992"));
    }
}