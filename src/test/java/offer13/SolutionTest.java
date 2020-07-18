package offer13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void movingCount() {
        Solution solution = new Solution();
        assertEquals(15, solution.movingCount(16, 8, 4));
    }
}