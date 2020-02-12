package leetcode_91;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution91Test {

    @Test
    public void numDecodings() {
        assertEquals(0, new Solution91().numDecodings("01"));
        assertEquals(0, new Solution91().numDecodings("0"));
        assertEquals(2, new Solution91().numDecodings("12"));
        assertEquals(3, new Solution91().numDecodings("226"));
    }
}