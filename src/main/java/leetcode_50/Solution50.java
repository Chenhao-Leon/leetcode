package leetcode_50;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/3
 * @Description: Pow(x, n)(超时)
 */
public class Solution50 {
    public double myPow(double x, int n){
        double res = 1;
        if(n > 0){
            while(n > 0){
                res = res * x;
                n--;
            }
        } else {
            while(n < 0){
                res = res / x;
                n++;
            }
        }
        return res;
    }
}
