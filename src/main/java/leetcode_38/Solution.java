package leetcode_38;

import java.util.Arrays;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/24
 * @Description: 报数
 */
public class Solution {
    public String countAndSay(int n) {
        StringBuilder str = new StringBuilder("1");
        StringBuilder ans;
        while(n > 1){
            ans = new StringBuilder();
            int dig = -1;
            int count = -1;
            for(int i = 0; i < str.length(); i++){
                if(dig == -1 && count == -1){
                    dig = str.charAt(i) - '0';
                    count = 1;
                }
                else{
                    count++;
                }
                if(i + 1 == str.length())
                    ans.append(count).append(dig);
                else if(i + 1 < str.length() && str.charAt(i) != str.charAt(i + 1)){
                    ans.append(count).append(dig);
                    dig = -1;
                    count = -1;
                }
            }
            n--;
            str = ans;
        }
        return str.toString();
    }
}
