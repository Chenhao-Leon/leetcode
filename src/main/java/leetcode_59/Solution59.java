package leetcode_59;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/8
 * @Description: 螺旋矩阵 II defeat 100%
 */
public class Solution59 {
    private boolean[][] flag;
    public int[][] generateMatrix(int n) {
        int[] X = {0, 1, 0, -1};
        int[] Y = {1, 0, -1, 0};
        int x = 0;
        int y = -1;
        int direction = 0;
        int[][] ans = new int[n][n];
        flag = new boolean[n][n];
        for(int i = 1; i <= n * n; i++){
            if(!isValid(x + X[direction], y + Y[direction], n))
                direction = (direction + 1) % 4;
            x = x + X[direction];
            y = y + Y[direction];
            ans[x][y] = i;
            flag[x][y] = true;
        }
        return ans;
    }

    private boolean isValid(int x, int y, int n){
        if(x >= n || y >= n || x < 0 || y < 0 || flag[x][y])
            return false;
        return true;
    }
}
