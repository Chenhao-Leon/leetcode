package leetcode_10;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/5
 * @Description: 正则表达式匹配（动态规划倒叙）
 */
// 本题的两个关键点：1、结合回文子串思考为什么这两题可以动态规划？因为在递归过程中进行了很多重复计算。
// 2、为什么可以倒叙？对于dp[i][j]能否匹配成功，只需要i之后和j之后的数据。
public class SolutionAnswer2 {
    public boolean isMatch(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;

        for (int i = text.length(); i >= 0; i--){
            for (int j = pattern.length() - 1; j >= 0; j--){
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                    dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
                } else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        return dp[0][0];
    }
}
