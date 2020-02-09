package leetcode_76;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/9
 * @Description: 最小覆盖子串(滑动窗口)
 */
public class Answer76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> dic = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            int count = dic.getOrDefault(t.charAt(i), 0);
            dic.put(t.charAt(i), count + 1);
        }
        int required = dic.size();
        int right = 0;
        int left = 0;
        int len = 1;
        Map<Character, Integer> window = new HashMap<>();
        int formed = 0;
        int minLeft = -1;
        int minRight = s.length();
        int minLen = s.length() + 1;
        while(right < s.length()){
            char c = s.charAt(right);
            int count = window.getOrDefault(c, 0);
            window.put(c, count + 1);
            if(dic.containsKey(c) && dic.get(c).intValue() == window.get(c).intValue())
                formed++;
            while(left <= right && formed == required){
                if(len < minLen){
                    minLeft = left;
                    minRight = right;
                    minLen = len;
                }
                char c1 = s.charAt(left);
                int count1 = window.get(c1);
                window.put(c1, count1 - 1);
                if(dic.containsKey(c1) && window.get(c1).intValue() < dic.get(c1).intValue())
                    formed--;
                left++;
                len--;
            }
            right++;
            len++;
        }
        return minLen == s.length() + 1? "": s.substring(minLeft, minRight + 1);
    }
}
