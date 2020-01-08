package leetcode_58;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution58Test {

    @Test
    public void lengthOfLastWord() {
        assertEquals(5, new Solution58().lengthOfLastWord("Hello World"));
        assertEquals(5, new Solution58().lengthOfLastWord("World"));
        assertEquals(0, new Solution58().lengthOfLastWord(" "));
    }
}