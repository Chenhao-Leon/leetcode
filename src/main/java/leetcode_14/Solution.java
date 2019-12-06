package leetcode_14;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/6
 * @Description: 最长公共前缀
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        int loop = Integer.MAX_VALUE;
        boolean flag;
        for (String str : strs) loop = Math.min(loop, str.length());
        for(int i = 0; i < loop; i++){
            flag = true;
            String temp = strs[0].substring(0, i + 1);
            for (String str : strs)
                if (!str.startsWith(temp)) {
                    flag = false;
                    break;
                }
            if(flag && temp.length() > common.length())
                common = temp;
        }
        return common;
    }
}
