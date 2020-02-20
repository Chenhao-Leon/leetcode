package leetcode_131;

import java.util.*;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/20
 * @Description: 分割回文串 回溯+动态规划
 */
public class Answer131 {
    public List<List<String>> partition(String s) {
        int len = s.length();
        List<List<String>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        boolean[][] dp = new boolean[len][len];
        for (int right = 0; right < len; right++) {
            for (int left = 0; left <= right; left++) {
                //状态转移方程：在 s[i] == s[j] 的时候，dp[i][j] 参考 dp[i + 1][j - 1]
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || dp[left + 1][right - 1])) {
                    dp[left][right] = true;
                }
            }
        }
        //或者使用双向队列Deque
        Stack<String> stack = new Stack<>();
        backtracking(s, 0, len, dp, stack, res);
        return res;
    }

    private void backtracking(String s,
                              int start,
                              int len,
                              boolean[][] dp,
                              Stack<String> stack,
                              List<List<String>> res) {
        if (start == len) {
            res.add(new ArrayList<>(stack));
            return;
        }

        for (int i = start; i < len; i++) {
            if (!dp[start][i]) {
                continue;
            }
            stack.push(s.substring(start, i + 1));
            backtracking(s, i + 1, len, dp, stack, res);
            stack.pop();
        }
    }
}
