package leetcode_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void intToRoman() {
//        assertEquals("III", new Solution().intToRoman(3));
//        assertEquals("IV", new Solution().intToRoman(4));
//        assertEquals("IX", new Solution().intToRoman(9));
//        assertEquals("LVIII", new Solution().intToRoman(58));
        assertEquals("MCMXCIV", new Solution().intToRoman(1994));
    }
}