package leetcode_28;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/17
 * @Description: 实现 strStr()(KMP算法实现)
 */
//孪生词缀：已匹配字符串相同的前缀和后缀部分
//KMP算法实际使用了动态规划思想，体现在两个地方:
//1、通过维护一个dp数组，使在匹配时txt的指针不后退，避免重复计算
//2、在计算已匹配pat的相同前后缀时，通过X = dp[X][pat.charAt(i)]避免再次计算前一趟的情况
//可谓动态规划中的动态规划
public class KMP {
    private int[][] dp;
    private String pat;

    public KMP(String pat) {
        this.pat = pat;
        int M = pat.length();
        // dp[状态][当前字符] = 下个状态
        dp = new int[M][256];
        dp[0][pat.charAt(0)] = 1;
        //初始化孪生词缀位置
        int X = 0;
        for (int i = 1; i < M; i++) {
            for (int j = 0; j < 256; j++) {
                if (pat.charAt(i) == j)
                    dp[i][j] = i + 1;
                else
                    dp[i][j] = dp[X][j];
            }
            // 更新孪生词缀X
             X = dp[X][pat.charAt(i)];
        }
    }

    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();
        int j = 0;
        for (int i = 0; i < N; i++) {
            j = dp[j][txt.charAt(i)];
            // 如果达到终止态，返回匹配开头的索引
            if (j == M) return i - M + 1;
        }
        return -1;
    }
}
