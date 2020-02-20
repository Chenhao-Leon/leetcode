package leetcode_134;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution134Test {

    @Test
    public void canCompleteCircuit() {
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        assertEquals(3, new Solution134().canCompleteCircuit(gas, cost));
    }
}