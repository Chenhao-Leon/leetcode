package leetcode_139;

import java.util.HashSet;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/22
 * @Description: 动态规划 时间5%
 */
public class Answer139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < wordDict.size(); i++) {
            set.add(wordDict.get(i));
        }
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = dp[j] && wordDict.contains(s.substring(j, i));
                if (dp[i])
                    break;
            }
        }
        return dp[s.length()];
    }
}
