package leetcode_172;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/28
 * @Description: 阶乘后的零
 * 题解：https://leetcode-cn.com/problems/factorial-trailing-zeroes/solution/xiang-xi-tong-su-de-si-lu-fen-xi-by-windliang-3/
 */
public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}
