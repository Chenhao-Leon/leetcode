package leetcode_73;

import java.util.LinkedList;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/8
 * @Description: 矩阵置零
 */
public class Solution73 {
    public void setZeroes(int[][] matrix) {
        LinkedList<int[]> zerosPos = new LinkedList<>();
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++)
                if(matrix[i][j] == 0)
                    zerosPos.add(new int[]{i, j});
        for(int[] tmp : zerosPos)
            set(tmp, matrix);
    }
    private void set(int[] pos, int[][] matrix){
        for(int i = 0; i < matrix.length; i++)
            matrix[i][pos[1]] = 0;
        for(int i = 0; i < matrix[0].length; i++)
            matrix[pos[0]][i] = 0;
    }
}
