package leetcode_62;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/14
 * @Description: 不同路径（超时）
 */
class Solution62 {
    private int m;
    private int n;
    private int count = 0;
    private int[] X = {1, 0};
    private int[] Y = {0, 1};
    public int uniquePaths(int m, int n){
        this.m = m;
        this.n = n;
        backTrack(1, 1);
        return count;
    }

    private void backTrack(int nowX, int nowY){
        if(nowX == n && nowY == m) {
            count++;
            return;
        }
        for(int i = 0; i < 2; i++)
            if(isValid(nowX + X[i], nowY + Y[i]))
                backTrack(nowX + X[i], nowY + Y[i]);
    }

    private boolean isValid(int x, int y){
        if(x > n || y > m) return false;
        return true;
    }
}
