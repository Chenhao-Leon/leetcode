package leetcode_27;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeElement() {
        assertEquals(2, new Solution().removeElement(new int[]{3, 2, 2, 3}, 3));
        assertEquals(5, new Solution().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}