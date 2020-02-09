package leetcode_76;

import org.junit.Test;

import static org.junit.Assert.*;

public class Answer76Test {

    @Test
    public void minWindow() {
        assertEquals("aa", new Answer76().minWindow("aa", "aa"));
        assertEquals("b", new Answer76().minWindow("ab", "b"));
        assertEquals("a", new Answer76().minWindow("a", "a"));
        assertEquals("BANC", new Answer76().minWindow("ADOBECODEBANC", "ABC"));
    }
}