package offer13;

public class Solution {
    private boolean[][] isVisited;
    private int res = 0;
    private int m;
    private int n;
    private int k;
    public int movingCount(int m, int n, int k) {
        isVisited = new boolean[m][n];
        this.m = m;
        this.n = n;
        this.k = k;
        traverse(0, 0);
        return res;
    }
    private void traverse(int x, int y){
        if(!isVisited[x][y] && (sumOfDigit(x) + sumOfDigit(y)) <= k){
            isVisited[x][y] = true;
            res++;
        } else {
            return;
        }
        if(x - 1 >= 0) traverse(x - 1, y);
        if(y - 1 >= 0) traverse(x, y - 1);
        if(x + 1 < m) traverse(x + 1, y);
        if(y + 1 < n) traverse(x, y + 1);
    }
    private int sumOfDigit(int a) {
        int sum = 0;
        while(a > 0){
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
