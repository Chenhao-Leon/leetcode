package leetcode_70;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/7
 * @Description: 爬楼梯（记忆递归）
 */
public class Solution70_2 {
    public int climbStairs(int n){
        int[] record = new int[n + 1];
        return backTrack(n, record);
    }
    private int backTrack(int n, int[] record){
        if(n == 0)
            return 1;
        if(n < 0)
            return 0;
        if(record[n] != 0)
            return record[n];
        record[n] = backTrack(n - 1, record) + backTrack(n - 2, record);
        return record[n];
    }
}
