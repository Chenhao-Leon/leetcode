package leetcode_60;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution60Test {

    @Test
    public void getPermutation() {
        assertEquals("123", new Solution60().getPermutation(3,1));
        assertEquals("231", new Solution60().getPermutation(3,4));
        assertEquals("132", new Solution60().getPermutation(3,2));
        assertEquals("213", new Solution60().getPermutation(3,3));
        assertEquals("2314", new Solution60().getPermutation(4, 9));
    }
}