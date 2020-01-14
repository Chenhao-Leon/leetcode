package leetcode_64;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/14
 * @Description: 最小路径和
 */
public class Solution64 {
    public int minPathSum(int[][] grid){
        int row = grid.length;
        int column = grid[0].length;

        for(int i = 1; i < column; i++)
            grid[0][i] += grid[0][i - 1];
        for(int i = 1; i < row; i++)
            grid[i][0] += grid[i - 1][0];
        for(int i = 1; i < row; i++)
            for(int j = 1; j < column; j++){
                grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
            }
        return grid[row - 1][column - 1];
    }
}
