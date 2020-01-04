package leetcode_51;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/4
 * @Description: N皇后
 * my solution 25%
 */
public class Solution51 {
    private List<List<String>> res = new ArrayList<>();
    private char[][] chess;
    private int n;
    public List<List<String>> solveNQueens(int n){
        this.n = n;
        chess = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                chess[i][j] = '.';
            }
        }
        backTrack(0, new boolean[n][n]);
        return res;
    }
    private void backTrack(int num, boolean[][] flag){//flag中false意为符合规则
        for(int i = 0; i < n; i++){
            if(!flag[num][i]){
                chess[num][i] = 'Q';
                if(num == n - 1){
                    List<String> ans = new ArrayList<>();
                    for(int j = 0; j < n; j++){
                        String str = String.valueOf(chess[j]);
                        ans.add(str);
                    }
                    res.add(ans);
                    chess[num][i] = '.';
                    return;
                }
                boolean[][] flagClone = new boolean[n][];
                //这里需要一维一维进行复制
                for(int j = 0; j < n; j++)
                    flagClone[j] = flag[j].clone();
                setFlag(num, i, flagClone);
                backTrack(num + 1, flagClone);
                chess[num][i] = '.';
            }
        }
    }
    
    private void setFlag(int row, int column, boolean[][] flag){
        int[] x = new int[]{1, 1, -1, -1};
        int[] y = new int[]{-1, 1, 1, -1};
        for(int i = 0; i < n; i++){
            flag[row][i] = true;
            flag[i][column] = true;
        }
        for(int i = 0; i < 4; i++){
            for(int j = 1 ; true; j++){
                if(x[i] * j + row < 0 || x[i] * j + row >=n || y[i] * j + column < 0 || y[i] * j + column >=n)
                    break;
                flag[x[i] * j + row][y[i] * j + column] = true;
            }
        }
    }
}
