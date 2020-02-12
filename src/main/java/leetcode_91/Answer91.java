package leetcode_91;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/12
 * @Description: 解码方法（动态规划）
 * 作者 ：pris_bupt
 */
public class Answer91 {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int pre = 1, curr = 1;//dp[-1] = dp[0] = 1
        for (int i = 1; i < s.length(); i++) {
            int tmp = curr;
            if (s.charAt(i) == '0')
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2')
                    curr = pre;
                else return 0;
            else if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6'))
                //关键理解这句
                curr = curr + pre;
            pre = tmp;
        }
        return curr;
    }
}
