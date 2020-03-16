package leetcode_394;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/16
 * @Description: 字符串解码 时间100%
 */
public class Solution {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                StringBuilder sb = new StringBuilder();
                i = decode(s, i, sb);
                res.append(sb);
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
    private int decode(String s, int index, StringBuilder ans){
        boolean flag = false;
        int count = 0;
        int i = index;
        StringBuilder sb = new StringBuilder();
        for(; i < s.length() && s.charAt(i) != ']'; i++){
            if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                if(!flag) continue;
                else {
                    StringBuilder tmp = new StringBuilder();
                    i = decode(s, i, tmp);
                    sb.append(tmp);
                }
            } else if(s.charAt(i) == '['){
                flag = true;
                count = Integer.parseInt(s.substring(index, i));
            } else{
                sb.append(s.charAt(i));
            }
        }
        for(int j = 0; j < count; j++){
            ans.append(sb);
        }
        return i;
    }
}
