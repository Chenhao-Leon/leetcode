package leetcode_54;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/6
 * @Description: 螺旋矩阵 defeat 100%
 * 由外到内按层遍历
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix){
        if(matrix.length == 0)
            return new ArrayList<>();
        int width = matrix[0].length;
        int height = matrix.length;
        List<Integer> ans = new ArrayList<>();
        int min = Math.min(width, height) + 1;
        //共有min / 2层
        for(int i = 0; i < min / 2; i++){
            //上侧
            for(int j = i; j < width - i; j++)
                ans.add(matrix[i][j]);
            //右侧
            for(int j = 1 + i; j < height - i; j++)
                ans.add(matrix[j][width - 1 - i]);
            //下侧
            // 由于某一层可能只有一行，这时上侧和下侧就重叠了，就会重复读
            // 因此需要加上height - 1 -i != i
            for(int j = width - 2 - i; j >= i && height - 1 -i != i; j--)
                ans.add(matrix[height - 1 - i][j]);
            //左侧
            // 同理，需要加上width - i - 1 != i
            for(int j = height - 2 - i; j >= 1 + i && width - i - 1 != i; j--)
                ans.add(matrix[j][i]);
        }
        return ans;
    }
}
