package leetcode_52;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/5
 * @Description: N皇后 II
 */
public class Solution52 {
    private int[] column;
    private int[] hills;
    private int[] dales;
    private int n;
    private int count = 0;

    private boolean isValid(int row, int col){
        int flag = column[col] + hills[row - col + n] + dales[row + col];
        return flag == 0;
    }

    private void placeQueen(int row, int col){
        column[col] = 1;
        hills[row - col + n] = 1;
        dales[row + col] = 1;
    }

    private void removeQueen(int row, int col){
        column[col] = 0;
        hills[row - col + n] = 0;
        dales[row + col] = 0;
    }

    private void backTrack(int row){
        for(int col = 0; col < n; col++){
            if(isValid(row, col)){
                if(row == n - 1) {
                    count++;
                    continue;
                }
                placeQueen(row, col);
                backTrack(row + 1);
                removeQueen(row, col);
            }
        }
    }

    public int totalNQueens(int n){
        this.n = n;
        column = new int[n];
        hills = new int[2 * n];
        dales = new int[2 * n];
        backTrack(0);
        return count;
    }
}
