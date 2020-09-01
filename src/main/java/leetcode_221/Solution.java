package leetcode_221;

//时间击败12%
public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] maxSquare = new int[row][column];
        int res = 0;
        for(int i = 0; i < row; i++){
            if(matrix[i][0] == '1') {
                maxSquare[i][0] = 1;
                res = 1;
            }
            else
                maxSquare[i][0] = 0;
        }
        for(int i = 0; i < column; i++){
            if(matrix[0][i] == '1') {
                maxSquare[0][i] = 1;
                res = 1;
            }
            else
                maxSquare[0][i] = 0;
        }
        for(int i = 1; i < row; i++){
            for(int j = 1; j < column; j++){
                if(matrix[i][j] == '0') {
                    maxSquare[i][j] = 0;
                    continue;
                }
                int step = maxSquare[i - 1][j - 1];
                int shorter = Math.min(upCheck(matrix, i, j, step), leftCheck(matrix, i, j, step));
                maxSquare[i][j] = Math.min(step, shorter) + 1;
                res = Math.max(res, maxSquare[i][j]);
            }
        }
        return res * res;
    }
    private int upCheck(char[][] matrix, int x, int y, int step){
        int length = 0;
        for(int i = 1; i <= step; i++){
            if(matrix[x - i][y] == '0')
                break;
            else length += 1;
        }
        return length;
    }
    private int leftCheck(char[][] matrix, int x, int y, int step){
        int length = 0;
        for(int i = 1; i <= step; i++){
            if(matrix[x][y - i] == '0')
                break;
            else length += 1;
        }
        return length;
    }
}
