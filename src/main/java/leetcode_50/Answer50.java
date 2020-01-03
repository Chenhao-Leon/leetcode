package leetcode_50;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/3
 * @Description: Pow(x, n)
 */
public class Answer50 {
    private double fastPow(double x, long n){
        if(n == 0) return 1.0;
        double half = fastPow(x, n / 2);
        if(n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }

    public double myPow(double x, int n){
        long N = n;
        if(n < 0){
            N = -N;
            x = 1 / x;
        }
        return fastPow(x, N);
    }
}
