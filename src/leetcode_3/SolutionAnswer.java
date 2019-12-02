package leetcode_3;

import java.util.HashMap;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/2
 * @Description: 官方解法三
 */
// 方法二更好理解
public class SolutionAnswer {
    public static int lengthOfLongestSubstring(String s){
        int n = s.length(), ans = 0;
        HashMap<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);// 注意理解
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
