package leetcode_202;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/1
 * @Description: 快乐数 时间67%
 */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1){
            if(!set.contains(n))
                set.add(n);
            else
                return false;
            n = bitSquareSum(n);
        }
        return true;
    }
    private int bitSquareSum(int num){
        int sum = 0;
        while(num != 0){
            int bit = num % 10;
            sum += bit * bit;
            num /= 10;
        }
        return sum;
    }
}
