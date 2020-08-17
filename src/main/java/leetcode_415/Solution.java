package leetcode_415;

/**
 * @author chenhao96
 * @description
 * @date 2020/8/17
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int len1 = num1.length(), len2 = num2.length();
        int index1 = len1 - 1, index2 = len2 - 1;
        int carry = 0;
        while (index1 >= 0 || index2 >= 0) {
            int a = index1 >= 0 ? num1.charAt(index1) - '0' : 0;
            int b = index2 >= 0 ? num2.charAt(index2) - '0' : 0;
            result.insert(0, (a + b + carry) % 10);
            carry = (a + b + carry) / 10;
            index1--;
            index2--;
        }
        if (carry != 0)
            result.insert(0, carry);
        return result.toString();
    }
}
