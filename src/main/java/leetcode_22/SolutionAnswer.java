package leetcode_22;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/11
 * @Description: 括号生成
 */
public class SolutionAnswer {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private void backtrack(List<String> ans,String cur, int left, int right, int n) {
        if(cur.length() == 2 * n){
            ans.add(cur);
            return;
        }
        if(left < n) backtrack(ans, cur + "(", left + 1, right, n);
        if(right < left) backtrack(ans, cur + ")", left, right + 1, n);
    }
}
