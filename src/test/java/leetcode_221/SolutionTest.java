package leetcode_221;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maximalSquare() {
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'},
        };
        char[][] matrix1 = {
                {'0', '1'},
        };
        char[][] matrix2 = {
                {'0','0','0','1'},
                {'1','1','0','1'},
                {'1','1','1','1'},
                {'0','1','1','1'},
                {'0','1','1','1'},
        };
        assertEquals(9, new Solution().maximalSquare(matrix2));
    }
}