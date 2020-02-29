package leetcode_190;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/29
 * @Description: 颠倒二进制位 我的渣渣算法 时间15%
 */
public class Solution {
    public int reverseBits(int n) {
        long unsignedN;
        if(n < 0){
            unsignedN = n + (long)Math.pow(2, 32);
        } else {
            unsignedN = n;
        }
        StringBuilder sb = new StringBuilder();
        while(unsignedN > 0){
            long num = unsignedN % 2;
            sb.append(num);
            unsignedN /= 2;
        }
        while(sb.length() < 32){
            sb.append(0);
        }
        int res = 0;
        int base = 1;
        for(int i = sb.length() - 1; i >= 0; i--){
            res += (sb.charAt(i) - '0') * base;
            base *= 2;
        }
        return res;
    }
}
