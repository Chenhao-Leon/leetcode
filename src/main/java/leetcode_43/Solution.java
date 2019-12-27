package leetcode_43;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/27
 * @Description: 字符串相乘(又臭又长解)
 */
public class Solution {
    public String multiply(String num1, String num2) {
        String ans = "";
        for(int i = num2.length() - 1; i >= 0; i--){
            ans = plus(multiplyOneDigit(num1, num2.charAt(i), num2.length() - 1 - i), ans);
        }
        return ans;
    }

    private String multiplyOneDigit(String num1, char digit, int zeroNum){
        int factor = digit - '0';
        int carry = 0;
        int index0fZero = -1;
        StringBuilder str = new StringBuilder();
        for(int i = num1.length() - 1; i >= 0; i--){
            int temp = (num1.charAt(i) - '0') * factor + carry;
            carry = temp / 10;
            if(temp % 10 != 0) index0fZero = i;
            str.insert(0, temp % 10);
        }
        if(carry > 0){
            str.insert(0, carry);
            index0fZero += 1;
        }
        while(zeroNum > 0){
            str.append(0);
            zeroNum--;
        }
        if(index0fZero == -1) return "0";
        return str.toString();
    }

    private String plus(String num1, String num2) {
        int carry = 0;
        int mod;
//        int i;
        if(num1.length() > num2.length()){
            String s = num1;
            num1 = num2;
            num2 = s;
        }
        int len1 = num1.length();
        int len2 = num2.length();
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= len1; i++){
            int temp = num1.charAt(len1 - i) - '0' + num2.charAt(len2 - i) - '0' + carry;
            carry = temp / 10;
            ans.insert(0, temp % 10);
        }
        if(carry > 0){
            StringBuilder temp = new StringBuilder(carry + "");
            for(int i = 0; i < len1; i++){
                temp.append(0);
            }
            ans = new StringBuilder(plus(temp.toString(), ans.toString()));
        }
        if(len2 - len1 > 0 && carry > 0){
            StringBuilder temp = new StringBuilder(num2.substring(0, len2 - len1));
            for(int i = 0; i < len1; i++){
                temp.append(0);
            }
            ans = new StringBuilder(plus(temp.toString(), ans.toString()));
        }
        else if(len2 > len1){
            ans = ans.insert(0, num2.substring(0, len2 - len1));
        }
        return ans.toString();
    }
}
