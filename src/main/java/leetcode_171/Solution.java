package leetcode_171;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/27
 * @Description: Excel表列序号
 */
public class Solution{
    public int titleToNumber(String s) {
        int sum = 0;
        int base = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            sum += (s.charAt(i) - 'A' + 1) * base;
            base *= 26;
        }
        return sum;
    }
}
