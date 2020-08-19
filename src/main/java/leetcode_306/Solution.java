package leetcode_306;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenhao96
 * @description 时间22%
 * @date 2020/8/19
 */
public class Solution {
    private List<String> list = new ArrayList<>();
    public boolean isAdditiveNumber(String num) {
        for (int i = 1; i <= num.length(); i++) {
            if (num.charAt(0) == '0' && i > 1)
                return false;
            if (dfs(num, 0, i, 0))
                return true;
        }
        return false;
    }

    /**
     *
     * @param num
     * @param start
     * @param end 最后一位数字索引的下一位
     * @param index list中的索引位置
     * @return
     */
    private boolean dfs(String num, int start, int end, int index) {
        String now = num.substring(start, end);
        if (index == 0 || index == 1) {
            list.add(now);
            if (searchThirdNum(num, end, index))
                return true;
            list.remove(index);
        } else  {
            if (add(list.get(index - 1), list.get(index - 2)).equals(now)) {
                list.add(now);
                if (end == num.length())
                    return true;
                else {
                    if (searchThirdNum(num, end, index))
                        return true;
                }
                list.remove(index);
            }
        }
        return false;
    }

    private boolean searchThirdNum(String num, int end, int index) {
        int nextStart = end;
        for (end += 1; end <= num.length(); end ++) {
            if (num.charAt(nextStart) == '0' && end - nextStart > 1)
                break;
            if (dfs(num, nextStart, end, index + 1))
                return true;
        }
        return false;
    }

    //求两个字符串之和
    private String add(String s1, String s2) {
        int len1 = s1.length() - 1;
        int len2 = s2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (len1 >= 0 || len2 >= 0 || carry > 0) {
            int num1 = len1 >= 0 ? (s1.charAt(len1) - '0') : 0;
            int num2 = len2 >= 0 ? (s2.charAt(len2) - '0') : 0;
            int sum = num1 + num2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            len1--;
            len2--;
        }

        return sb.reverse().toString();
    }
}
