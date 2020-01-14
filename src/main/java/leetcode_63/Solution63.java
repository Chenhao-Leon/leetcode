package leetcode_63;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/14
 * @Description: 不同路径 II 回溯（leetcode出现诡异编译错误，未测试）
 */
public class Solution63 {
    private int m;
    private int n;
    private int[][] obstacleGrid;
    private int count = 0;
    public int uniquePaths(int[][] obstacleGrid){
        this.m = obstacleGrid.length;
        this.n = obstacleGrid[0].length;
        this.obstacleGrid = obstacleGrid;
        backTrack(0, 0);
        return count;
    }

    private void backTrack(int nowX, int nowY){
        if(nowX == n - 1 && nowY == m - 1) {
            count++;
            return;
        }
        int[] X = {1, 0};
        int[] Y = {0, 1};
        for(int i = 0; i < 2; i++)
            if(isValid(nowX + X[i], nowY + Y[i]))
                backTrack(nowX + X[i], nowY + Y[i]);
    }

    private boolean isValid(int x, int y){
        if(x >= n || y >= m || obstacleGrid[x][y] == 1) return false;
        return true;
    }
}
