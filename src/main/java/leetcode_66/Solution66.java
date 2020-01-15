package leetcode_66;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/15
 * @Description: 加一 defeat 100%
 */
public class Solution66 {
    public int[] plusOne(int[] digits){
        int carry = 0;
        int len = digits.length;
        int[] ans = new int[len];
        for(int i = len - 1; i >= 0; i--){
            int sum;
            if(i == len - 1)
                sum = digits[i] + 1 + carry;
            else sum = digits[i] + carry;
            ans[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry != 0) {
            int[] fin = new int[len + 1];
            for(int i = len - 1; i >= 0; i--)
                fin[i + 1] = ans[i];
            fin[0] = carry;
            return fin;
        }
        return ans;
    }
}
