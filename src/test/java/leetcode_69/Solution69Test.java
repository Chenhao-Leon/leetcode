package leetcode_69;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution69Test {

    @Test
    public void mySqrt() {
//        assertEquals(46339, new Solution69().mySqrt(2147395599));
//        assertEquals(2, new Solution69().mySqrt(4));
        assertEquals(2, new Solution69().mySqrt(8));
        assertEquals(0, new Solution69().mySqrt(0));
        assertEquals(1, new Solution69().mySqrt(1));
    }
}