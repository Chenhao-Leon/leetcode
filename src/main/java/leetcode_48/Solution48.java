package leetcode_48;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/3
 * @Description: 旋转图像
 * 先转置，然后上下翻转
 */
public class Solution48 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i = 0; i < len - 1; i++){
            for(int j = 0; j < len - i - 1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 -j][len - 1 - i];
                matrix[len - 1 -j][len - 1 - i] = temp;
            }
        }
        for(int i = 0; i < len / 2; i++){
            for(int j = 0; j < len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - i][j];
                matrix[len - 1 - i][j] = temp;
            }
        }
    }
}
