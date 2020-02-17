import leetcode_122.Solution122;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution122Test {

    @Test
    public void maxProfit() {
        assertEquals(0, new Solution122().maxProfit(new int[]{7,6,4,3,1}));
        assertEquals(4, new Solution122().maxProfit(new int[]{1,2,3,4,5}));
        assertEquals(7, new Solution122().maxProfit(new int[]{7,1,5,3,6,4}));
    }
}