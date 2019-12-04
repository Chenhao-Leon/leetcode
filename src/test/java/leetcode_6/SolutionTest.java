package leetcode_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void convert() {
        assertEquals("LCIRETOESIIGEDHN", new Solution().convert("LEETCODEISHIRING", 3));
        assertEquals("LDREOEIIECIHNTSG", new Solution().convert("LEETCODEISHIRING", 4));
        assertEquals("A", new Solution().convert("A", 1));
    }
}