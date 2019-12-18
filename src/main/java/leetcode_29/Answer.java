package leetcode_29;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/18
 * @Description: 两数相除
 */
//要点1、用移位运算（<<）模拟CPU内部的除法过程，时间复杂度为log(n)，暴力解为n
//要点2、Int负数比正数多1个，所以正数求反没毛病，负数求反就有很多麻烦事
public class Answer {
    public int divide(int dividend, int divisor) {
        boolean sign = (dividend > 0) ^ (divisor > 0);
        int result = 0;
        // 因为负数比整数多一个，将整数转化为负数处理
        // 如果转为整数处理，-2147483648/-1就需要做特殊处理，比较麻烦
        if(dividend > 0) dividend = -dividend;
        if(divisor > 0) divisor = -divisor;
        while(dividend <= divisor) {
            int temp_result = -1;
            int temp_divisor = divisor;
            while(dividend <= (temp_divisor << 1)) {
                if(temp_divisor <= (Integer.MIN_VALUE >> 1)) break;
                temp_result = temp_result << 1;
                temp_divisor = temp_divisor << 1;
            }
            dividend = dividend - temp_divisor;
            result += temp_result;
        }
        if(!sign) {
            if(result <= Integer.MIN_VALUE) return Integer.MAX_VALUE;
            result = - result;
        }
        return result;
    }
}
