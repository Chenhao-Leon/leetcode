package leetcode_198;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/29
 * @Description:
 */
public class Answer {
    public int rob(int[] num) {
        int prevMax = 0;
        int currMax = 0;
        for (int x : num) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}
