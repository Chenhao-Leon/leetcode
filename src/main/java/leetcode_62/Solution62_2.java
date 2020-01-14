package leetcode_62;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/14
 * @Description: 不同路径 defeat 100%
 * 算法：由于只能向右和向下移动，因此向右和向下移动的次数都是固定的，这其实就转化为排列组合
 * 问题。这个排列组合的问题最简单的解法是C（下标：m+n-2)[上标：n-1]
 */
public class Solution62_2 {
    public int uniquePaths(int m, int n){
        int Cn = m + n - 2;
        int Cr = n - 1;
        //这里需要利用数学公式对Cr做一下变换，否则C(99)[99]就会计算出错
        Cr = Cr > Cn / 2? Cn - Cr: n - 1;
        long ans = 1;
        for(int i = 0; i < Cr; i++) {
            ans *= Cn - i;
            ans /= i + 1;
        }
        return (int) ans;
    }
}
