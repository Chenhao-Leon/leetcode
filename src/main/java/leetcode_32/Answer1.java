package leetcode_32;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/19
 * @Description: 最长有效括号(dp法)
 * 要点1、dp[]和之前的dp数组含义不一样，它表示当s[i]为')'时从开始到i的最长有效括号数，所以当s[i]为'('时，dp为初始的0。
 *       故需要maxans来记录字符串的最长有效括号，而不是根据dp[len-1]直接得出。
 * 要点2、出现“......))”形式需要特殊处理，需要判断前面是否有一个'('和第二个‘)’相匹。手推“()(())”这个例子可以帮助理解。
 */
public class Answer1 {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }
}
