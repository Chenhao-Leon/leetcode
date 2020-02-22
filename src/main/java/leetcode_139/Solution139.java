package leetcode_139;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/22
 * @Description: 单词拆分 暴力超时
 */
public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return backTrack(s, new HashSet<String>(wordDict));
    }
    private boolean backTrack(String s, HashSet<String> set){
        int len = s.length();
        if(set.contains(s)) return true;
        for(int i = 0; i < len; i++){
            if(!set.contains(s.substring(0, i + 1)))
                continue;
            if(backTrack(s.substring(i + 1), set)) return true;
        }
        return false;
    }
}
