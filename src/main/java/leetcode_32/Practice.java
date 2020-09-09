package leetcode_32;

/**
 * @Auther: Chen Hao
 * @Date: 2020/9/9
 * @Description:
 */
public class Practice {
    public int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        int maxLen = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ')') {
                if (chars[i - 1] == '(')
                    dp[i] = 2 + (i - 2 >= 0 ? dp[i - 2] : 0);
                else if (chars[i - 1] == ')' && dp[i - 1] != 0) {
                    int index = i - 1 - dp[i - 1];
                    if (index >= 0 && chars[index] == '(')
                        dp[i] = dp[i - 1] + 2 + (index - 1 >= 0 ? dp[index - 1] : 0);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }
}
