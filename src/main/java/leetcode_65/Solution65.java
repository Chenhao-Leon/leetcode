package leetcode_65;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/15
 * @Description: 有效数字 defeat 22%（作弊）
 */
public class Solution65 {
    public boolean isNumber(String s){
        s = s.trim();
        if(s.indexOf(" ") > 0) return false;
        int index = s.indexOf("e");
        if(index < 0) return isFloat(s);
        else return isFloat(s.substring(0, index)) && isLong(s.substring(index + 1));
    }

    private boolean isFloat(String s){
        if(s.endsWith("f") || s.endsWith("D")) return false;
        try {
            Double.parseDouble(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean isLong(String s){
        try {
            Long.parseLong(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
