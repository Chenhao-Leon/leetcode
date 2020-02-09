package leetcode_76;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/9
 * @Description: 最小覆盖子串（滑动窗口之搞不懂为啥这种方法时间很短）
 */
public class Answer76_2 {
    public String minWindow(String s, String t) {
        int[] map = new int[256];
        for (char c : t.toCharArray()) map[c] += 1;
        int cnt = t.length();
        int start = 0 ,end = 0;
        int begin = -1;
        int len = s.length();
        while (end < s.length()) {
            char c = s.charAt(end);
            int num = map[c] - 1;
            map[c] -= 1;
            if (num >= 0) cnt -= 1;
            while (cnt == 0) {
                if (end - start + 1 <= len) {
                    len = end - start + 1;
                    begin = start;
                }
                c = s.charAt(start);
                num = map[c] + 1;
                map[c] += 1;
                if (num > 0) cnt += 1;
                start += 1;
            }
            end += 1;
        }
        if (begin == -1) return "";
        return s.substring(begin, begin + len);
    }
}
