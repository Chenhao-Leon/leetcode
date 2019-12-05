package leetcode_10;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/5
 * @Description: 正则表达式匹配(递归实现)
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        return isSubMatch(s, 0, s.length() - 1, p, 0 , p.length() - 1);
    }

    private boolean isSubMatch(String s, int s1, int e1, String p, int s2, int e2){
        if(s1 > e1 && s2 > e2)
            return true;
        else if(s2 > e2)
            return false;
        while(s2 <= e2){
            if(p.charAt(s2) >= 'a' && p.charAt(s2) <= 'z'){
                if(s2 + 1 <= e2 && p.charAt(s2 + 1) == '*'){
                    s2++;
                    while(true){
                        if(isSubMatch(s, s1, e1, p, s2 + 1, e2))
                            return true;
                        if(s1 <= e1 && s.charAt(s1) == p.charAt(s2 - 1)) s1++;
                        else break;
                    }
                    s2++;
                }
                else{
                    if(s1 <= e1 && s.charAt(s1) == p.charAt(s2)){
                        s1++;
                        s2++;
                    }
                    else return false;
                }
            }
            else{
                if(s2 + 1 <= e2 && p.charAt(s2 + 1) == '*'){
                    s2++;
                    while(s1 <= e1){
                        if(isSubMatch(s, s1, e1, p, s2 + 1, e2)) return true;
                        s1++;
                    }
                    s2++;

                }
                else{
                    if(s1 > e1) return false;
                    s1++;
                    s2++;
                }
            }
        }
        return s1 == e1 + 1 && s2 == e2 + 1;
    }
}
