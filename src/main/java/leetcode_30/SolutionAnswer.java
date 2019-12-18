package leetcode_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/18
 * @Description: 串联所有单词的子串(双HashMap法，滑动窗口？)
 */
public class SolutionAnswer {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s.isEmpty() || words.length == 0) return new ArrayList<>();
        HashMap<String, Integer> pattern = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int wordLen = words[0].length();
        int wordNum = words.length;
        int charSum = wordLen * wordNum;
        for(String word : words){
            int value = pattern.getOrDefault(word, 0);
            pattern.put(word, value + 1);
        }
        for(int i = 0; i < s.length() - charSum + 1; i++){
            int num = 0;
            HashMap<String, Integer> text = new HashMap<>();
            while(num < wordNum){
                String word = s.substring(i + num * wordLen, i + (num + 1) * wordLen);
                if(pattern.containsKey(word)){
                    int value = text.getOrDefault(word, 0);
                    text.put(word, value + 1);
                    if(value + 1 > pattern.get(word))
                        break;
                }
                else
                    break;
                num ++;
            }
            if(num == wordNum)
                ans.add(i);
        }
        return ans;
    }
}
