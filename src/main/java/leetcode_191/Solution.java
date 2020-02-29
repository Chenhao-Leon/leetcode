package leetcode_191;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/29
 * @Description: 位1的个数
 */
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1) count++;
            n >>= 1;
        }
        return count;
    }
}
