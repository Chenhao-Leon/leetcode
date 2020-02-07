package leetcode_70;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/7
 * @Description: 爬楼梯（暴力 超时）
 */
public class Solution70 {
    private int sum = 0;
    public int climbStairs(int n) {
        backTrack(n);
        return sum;
    }

    private void backTrack(int n){
        if(n == 0){
            sum++;
            return;
        }
        backTrack(n - 1);
        if(n > 1)
            backTrack(n - 2);
    }
}
