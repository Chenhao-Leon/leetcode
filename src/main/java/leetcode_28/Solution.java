package leetcode_28;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/17
 * @Description: 实现 strStr()
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        int len = needle.length();
        for(int i = 0; i < haystack.length() - len + 1; i++){
            if(haystack.substring(i, i + len).equals(needle))
                return i;
        }
        return -1;
    }
}
