package leetcode_44;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/27
 * @Description: 通配符匹配(超时回溯)
 */
public class Solution {
    public boolean isMatch(String str, String p) {
        int len1 = str.length();
        int len2 = p.length();
        if(str.equals("") && p.equals("")) return true;
        else if(len1 > 0 && len2 == 0) return false;
        boolean flag;
        if(p.charAt(0) == '?'){
            flag = !str.equals("");
        } else if(p.charAt(0) == '*'){
            flag = true;
        } else{
            flag = !str.equals("") && str.charAt(0) == p.charAt(0);
        }
        if(p.charAt(0) == '*')
            return isMatch(str, p.substring(1)) || (len1 > 0 && isMatch(str.substring(1), p));
        else
            return flag && isMatch(str.substring(1), p.substring(1));
    }
}
