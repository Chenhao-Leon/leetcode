package leetcode_8;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/5
 * @Description: 回文数
 */
//无需转换为字符串的数值解法
public class SolutionAnswer {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int div = 1;
        // 得到最高位的权值
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
