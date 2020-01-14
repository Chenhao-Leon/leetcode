package leetcode_62;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution622Test {

    @Test
    public void uniquePaths() {
        assertEquals(1, new Solution62_2().uniquePaths(1, 100));
        assertEquals(548354040, new Solution62_2().uniquePaths(13, 23));
        assertEquals(3, new Solution62_2().uniquePaths(3, 2));
        assertEquals(28, new Solution62_2().uniquePaths(7, 3));
    }
}