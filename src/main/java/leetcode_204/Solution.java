package leetcode_204;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/1
 * @Description: 计数质数 时间5%
 */
public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrimes(i)) count++;
        }
        return count;
    }
    private boolean isPrimes(int n){
        // 这样写超时，写成i * i <= n通过
//        for(int i = 2; i <= Math.sqrt(n); i++){
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
