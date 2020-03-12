package leetcode_71;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/12
 * @Description: 简化路径 时间80%
 */
public class Solution {
    public String simplifyPath(String path) {
        LinkedList<String> list = new LinkedList<>();
        String[] strings = path.split("/");
        for(int i = 0; i < strings.length; i++){
            if(strings[i].equals("") || strings[i].equals("."))
                continue;
            else if(strings[i].equals("..")) {
                if(!list.isEmpty())
                    list.removeLast();
            }
            else
                list.add(strings[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(String tmp : list)
            sb.append("/").append(tmp);
        String res = sb.toString();
        return res.equals("") ? "/" : res;
    }
}
