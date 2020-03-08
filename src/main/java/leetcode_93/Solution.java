package leetcode_93;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/8
 * @Description: 复原IP地址 时间98%
 */
public class Solution {
    private int[] ip = new int[4];
    private int index = 0;
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backTrack(s, res, 0, 0);
        return res;
    }
    private void backTrack(String s, List<String> res, int start, int num){
        if(start == s.length() && num == 4){
            StringBuilder sb = new StringBuilder();
            sb.append(ip[0]);
            for(int i = 1; i < 4; i++)
                sb.append(".").append(ip[i]);
            res.add(sb.toString());
            return;
        } else if(start == s.length() || num == 4)
            return;
        if(s.charAt(start) == '0') {
            ip[index++] = 0;
            backTrack(s, res, start + 1, num + 1);
            index--;
            return;
        }
        for(int i = start; i < start + 3 && i < s.length(); i++){
            int value = Integer.parseInt(s.substring(start, i + 1));
            if(value >= 0 && value <= 255){
                ip[index++] = value;
                backTrack(s, res, i + 1, num + 1);
                index--;
            }
        }
    }
}
