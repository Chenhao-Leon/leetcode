package leetcode_8;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/4
 * @Description: 字符串转换整数 (atoi)
 */
public class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0 || (!Character.isDigit(s.charAt(0)) && s.charAt(0) != '-' && s.charAt(0) != '+'))
            return 0;
        s = s.trim();
        int flag = 1;
        int result = 0;
        int start = 0;
        if(s.charAt(0) == '-'){
            flag = -1;
            start = 1;
        }
        else if(s.charAt(0) == '+')
            start = 1;
        for(int i = start; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                // 注意char转int的方法
                if((long)result * 10 + s.charAt(i) - '0' > Integer.MAX_VALUE)
                    return flag == 1? Integer.MAX_VALUE: Integer.MIN_VALUE;
                result = result * 10 + s.charAt(i) - '0';
            }
            else
                break;
        }
        return result * flag;
    }
}
