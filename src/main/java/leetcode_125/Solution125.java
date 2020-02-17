package leetcode_125;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/17
 * @Description: 验证回文串（时间6%）
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        char[] str = new char[1000000];
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z'))
                str[len++] = c;
            else if(c >= 'A' && c <= 'Z')
                str[len++] = (char)(c - 'A' + 'a');
        }
        for(int i = 0; i < len / 2; i++){
            if(str[i] != str[len - 1 - i])
                return false;
        }
        return true;
    }
}
