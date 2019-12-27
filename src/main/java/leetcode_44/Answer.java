package leetcode_44;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/27
 * @Description: 通配符匹配
 */
class Answer {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        //f[i][j]表示 s的前i个字符能否和p的前j个字符匹配
        boolean[][] f = new boolean[m+1][n+1];

        f[0][0] = true;
        for (int i = 1; i <= n; i++) {
            f[0][i] = f[0][i-1] && p.charAt(i-1) == '*';
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?'){
                    f[i][j] = f[i-1][j-1];
                }
                if(p.charAt(j - 1) == '*'){
                    /**
                     * 两种情况
                     * a  a*,即p[j]匹配到的s的是空串 f[i][j] = f[i][j-1]
                     *  abc a*
                     */
                    f[i][j] = f[i][j-1] || f[i-1][j];
                }
            }
        }
        return f[m][n];

    }
}
