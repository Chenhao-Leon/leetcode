package leetcode_13;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/6
 * @Description: 罗马数字转整数
 */
public class Solution {
    public int romanToInt(String str) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
            while(str.startsWith(romans[i])){
                sum += nums[i];
                str = str.substring(romans[i].length());
            }
        return sum;
    }
}
