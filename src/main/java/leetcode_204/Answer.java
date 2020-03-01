package leetcode_204;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/1
 * @Description: 厄拉多塞筛法
 */
public class Answer {
    public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!isPrimes[i]){
                for(int j = i; j < n; j += i)
                    isPrimes[j] = true;
                count++;
            }
        }
        return count;
    }
}
