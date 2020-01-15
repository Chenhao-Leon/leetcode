package leetcode_67;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/15
 * @Description: 二进制求和 defeat 16%
 */
public class Solution67 {
    public String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();
        for(int i = 0; i < Math.abs(lenA - lenB); i++)
            sb.append(0);
        if(lenA < lenB) a = sb.toString() + a;
        else b = sb.toString() + b;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = a.length() - 1; i >= 0; i--){
            int temp = a.charAt(i) - '0' + b.charAt(i) - '0' + carry;
            ans.insert(0, temp % 2);
            carry = temp / 2;
        }
        if(carry != 0) ans.insert(0, carry);
        return ans.toString();
    }
}
