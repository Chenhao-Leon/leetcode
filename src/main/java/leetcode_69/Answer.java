package leetcode_69;

/**
 * @author chenhao96
 * @description 牛顿法答案，题解见https://leetcode-cn.com/problems/sqrtx/solution/er-fen-cha-zhao-niu-dun-fa-python-dai-ma-by-liweiw/
 * 这个解法不光可用于本题的精确到整数，还可用于精确到某一位小数
 * @date 2020/8/19
 */
public class Answer {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        double C = x, x0 = x;
        while (true) {
            double xi = 0.5 * (x0 + C / x0);
            if (Math.abs(x0 - xi) < 1e-7) {
                break;
            }
            x0 = xi;
        }
        return (int)x0;
    }
}
