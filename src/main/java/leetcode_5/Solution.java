package leetcode_5;


/**
 * @Auther: Chen Hao
 * @Date: 2019/12/3
 * @Description: 最长回文子串
 */
// 使用StringBuilder或者StringBuffer的reverse方法判断回文串会超时
// 使用如下isHuiWen方法可以通过，但是用时只击败9.9%
public class Solution {
    public String longestPalindrome(String s){
        if(s.length() == 0)
            return "";
        String r = s.substring(0, 1);
        int len = 1;
        for(int i = 0; i + len <= s.length() - 1; i++)
            for(int j = i + len; j <= s.length() - 1; j++){
                String sub = s.substring(i, j + 1);
                if(isHuiwen(sub) && sub.length() > len){
                    r = sub;
                    len = r.length();
                }
            }
        return r;
    }

    private boolean isHuiwen(String sub){
        int len = sub.length();
        for(int i = 0; i < len / 2; i++)
            if(sub.charAt(i) != sub.charAt(len - i - 1))
                return false;
        return true;
    }
}
