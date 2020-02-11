package leetcode_79;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution79Test {

    @Test
    public void exist() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertTrue(new Solution79().exist(board, "ABCCED"));
        assertTrue(new Solution79().exist(board, "SEE"));
        assertFalse(new Solution79().exist(board, "ABCB"));
    }
}