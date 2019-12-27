package leetcode_10;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/27
 * @Description: 正则表达式匹配(dp倒叙微改良)
 */
public class Solution2 {
    public boolean isMatch(String text, String pattern) {
        int len1 = text.length();
        int len2 = pattern.length();
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        //初始化
        dp[len1][len2] = true;
        for(int i = len2 - 1; i >= 0; i--){
            if(i < len2 -1 && pattern.charAt(i + 1) == '*' && dp[len1][i + 2])
                dp[len1][i] = true;
        }
        //倒叙
        for(int i = len1 - 1; i >= 0; i--){
            for(int j = len2 - 1; j >= 0; j--){
                boolean flag = pattern.charAt(j) == '.' || text.charAt(i) == pattern.charAt(j);
                //或
                // if(j < len2 - 1 && pattern.charAt(j + 1) == '*')
                //     dp[i][j] = dp[i][j + 2] || (flag && dp[i + 1][j]);
                //else if(flag) dp[i][j] = dp[i + 1][j + 1];
                if(flag) dp[i][j] = dp[i + 1][j + 1];
                if(j < len2 - 1 && pattern.charAt(j + 1) == '*')
                    dp[i][j] = dp[i][j + 2] || (flag && dp[i + 1][j]);
            }
        }
        return dp[0][0];
    }
}
