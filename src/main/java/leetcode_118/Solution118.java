package leetcode_118;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/16
 * @Description: 杨辉三角
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> level;
        for(int i = 0; i < numRows; i++){
            level = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0)
                    level.add(1);
                else if(j == i)
                    level.add(1);
                else{
                    List<Integer> last = ans.get(ans.size() - 1);
                    int left = last.get(j - 1);
                    int right = last.get(j);
                    level.add(left + right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
