package leetcode_7;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/4
 * @Description: 整数反转
 */
// Wow，时间击败100%用户
public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0){
            if((long)result * 10 + x % 10 > Integer.MAX_VALUE || (long)result * 10 + x % 10 < -Integer.MAX_VALUE - 1)
                return 0;
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
