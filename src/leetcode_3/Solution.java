package leetcode_3;

import java.util.HashMap;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/2
 * @Description: leetcode2:无重复字符的最长子串
 */

public class Solution {
    public static int lengthOfLongestSubstring(String s){
        String longest = "";
        for(int i = 0;i < s.length();i ++){
            String temp = "";
            for(int j = i;j < s.length();j ++){
                if (!temp.contains(s.substring(j, j + 1)))
                    temp = temp + s.charAt(j);
                else
                    break;
            }
            if (temp.length() > longest.length())
                longest = temp;
        }
        return longest.length();
    }
}
