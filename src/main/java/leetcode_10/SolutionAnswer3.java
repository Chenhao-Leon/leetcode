package leetcode_10;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/27
 * @Description: 正则表达式匹配(正叙)
 * 人已晕
 */
public class SolutionAnswer3 {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;

        for(int j = 2; j <= m; j+=2) {
            if (p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-2];
            } else {
                dp[0][j] = false;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char a = s.charAt(i-1);
                char b = p.charAt(j-1);
                if (b == '*') {
                    char prev = p.charAt(j-2);
                    // zero match
                    dp[i][j] = dp[i][j-2];
                    // match from 1 ~ i
                    for (int k = 1; k <= i && (s.charAt(i - k) == prev || prev == '.'); k++) {
                        dp[i][j] |= dp[i-k][j-2];
                    }
                } else {
                    dp[i][j] = (a == b || b == '.') ? dp[i-1][j-1] : false;
                }
            }
        }
        return dp[n][m];
    }
}
