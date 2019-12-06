package leetcode_14;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/6
 * @Description: 最长公共前缀
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String common = "";
        int loop = Integer.MAX_VALUE;
        boolean flag;
        for (String str : strs) loop = Math.min(loop, str.length());
        for(int i = loop - 1; i >= 0; i--){
            flag = true;
            String temp = strs[0].substring(0, i + 1);
            for (String str : strs){
                if (!str.startsWith(temp)) {
                    flag = false;
                    break;
                }
            }
            if(!flag) continue;
            common = temp;
            break;
        }
        return common;
    }
}
