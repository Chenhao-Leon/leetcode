package leetcode_54;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution54Test {

    @Test
    public void spiralOrder() {
        System.out.println(new Solution54().spiralOrder(new int[][]{{7}, {9}, {6}}));
        System.out.println(new Solution54().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9,10,11,12}}));
        System.out.println(new Solution54().spiralOrder(new int[][]{{1, 2, 3 }, {4, 5, 6}, { 7, 8, 9}}));
    }
}