package leetcode_67;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution67Test {

    @Test
    public void addBinary() {
        assertEquals("100", new Solution67().addBinary("11", "1"));
        assertEquals("10101", new Solution67().addBinary("1010", "1011"));
    }
}