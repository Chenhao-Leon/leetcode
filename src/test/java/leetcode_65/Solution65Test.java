package leetcode_65;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution65Test {

    @Test
    public void isNumber() {
//        assertTrue(new Solution65().isNumber("0"));
//        assertTrue(new Solution65().isNumber("0.1"));
//        assertFalse(new Solution65().isNumber("abc"));
//        assertFalse(new Solution65().isNumber("1 a"));
//        assertTrue(new Solution65().isNumber("2e10"));
//        assertTrue(new Solution65().isNumber("-90e3       "));
//        assertFalse(new Solution65().isNumber("1e"));
//        assertFalse(new Solution65().isNumber("e3"));
//        assertTrue(new Solution65().isNumber("6e-1"));
        assertFalse(new Solution65().isNumber("0638D"));
        assertTrue(new Solution65().isNumber("44e016912630333"));
        assertFalse(new Solution65().isNumber(" 99e2.5  "));
        assertTrue(new Solution65().isNumber("53.5e93"));
        assertFalse(new Solution65().isNumber("--6"));
        assertFalse(new Solution65().isNumber("-+3"));
        assertFalse(new Solution65().isNumber("95a54e53"));
    }
}