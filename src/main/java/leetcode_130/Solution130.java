package leetcode_130;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/19
 * @Description: 被围绕的区域 时间 7%
 */
public class Solution130 {
    private boolean[][] changeToX;
    private int[] X = new int[]{0, 0, 1, -1};
    private int[] Y = new int[]{1, -1, 0, 0};
    public void solve(char[][] board) {
        int row = board.length;
        if(row <= 1) return;
        int column = board[0].length;
        changeToX = new boolean[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(board[i][j] == 'O' && !changeToX[i][j]){
                    boolean[][] isVisited = new boolean[row][column];
                    if(isAround(board, isVisited, i, j))
                        setX(board, isVisited);
                }
            }
        }
    }
    private boolean isAround(char[][] board, boolean[][] isVisited, int x, int y){
        isVisited[x][y] = true;
        for(int i = 0; i < 4; i++){
            int new_x = x + X[i];
            int new_y = y + Y[i];
            if(!isOutside(new_x, new_y)){
                if(!isVisited[new_x][new_y] && board[new_x][new_y] == 'O' && !isAround(board, isVisited, new_x, new_y))
                    return false;
            }
            else return false;
        }
        return true;
    }
    private boolean isOutside(int x, int y){
        if(x < 0 || x >=changeToX.length || y < 0 || y >= changeToX[0].length)
            return true;
        return false;
    }
    private void setX(char[][] board, boolean[][] isVisited){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(isVisited[i][j])
                    board[i][j] = 'X';
            }
        }
    }
}
