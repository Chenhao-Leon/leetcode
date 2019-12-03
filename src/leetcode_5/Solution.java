package leetcode_5;


/**
 * @Auther: Chen Hao
 * @Date: 2019/12/3
 * @Description: 最长回文子串
 */
// 暴力解法，超时。。。
public class Solution {
    public String longestPalindrome(String s){
        String r = s.substring(0, 1);
        int len = 1;
        for(int i = 0; i + len <= s.length() - 1; i++)
            for(int j = i + len; j <= s.length() - 1; j++){
                StringBuffer sub = new StringBuffer(s.substring(i, j + 1));
                if(sub.toString().equals(sub.reverse().toString())){
                    r = sub.toString();
                    len = r.length();
                }
            }
        return r;
    }
}
