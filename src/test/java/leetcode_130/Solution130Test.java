package leetcode_130;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution130Test {

    @Test
    public void solve() {
        char[][] board = new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'},
        };
        new Solution130().solve(board);
        for(char[] chars : board) {
            for (char c : chars) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}